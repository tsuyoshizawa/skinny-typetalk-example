package controller

import model.User
import skinny.controller.feature.TypetalkLoginFeature
import skinny.oauth2.client.typetalk.TypetalkUser

class SessionsController extends ApplicationController with TypetalkLoginFeature {

  override def redirectURI = "http://localhost:8080/auth/typetalk/callback"

  override protected def saveAuthorizedUser(typetalkUser: TypetalkUser): Unit = {
    session.setAttribute("currentUser", User(typetalkUser.fullName))
  }

  override protected def handleWhenLoginSucceeded(): Any = {
    redirect302("/")
  }

  def logout = {
    session.removeAttribute("currentUser")
    session.invalidate()
    redirect302("/")
  }
}
