package controller

import skinny._
import skinny.controller.AssetsController

object Controllers {

  def mount(ctx: ServletContext): Unit = {
    root.mount(ctx)
    session.mount(ctx)
    AssetsController.mount(ctx)
  }

  object root extends RootController with Routes {
    val indexUrl = get("/?")(index).as('index)
  }

  object session extends SessionsController with Routes {
    val typetalkLoginUrl = get("/auth/typetalk")(loginRedirect).as('typetalkLogin)
    val typetalkLoginCallbackUrl = get("/auth/typetalk/callback")(callback).as('typetalkLogin)
    val logoutUrl = get("/logout")(logout).as('logout)
  }
}
