package filter

import controller.Controllers
import skinny.controller.feature.BeforeAfterActionFeature
import skinny.filter.SkinnyFilter
import skinny.micro.base.MainThreadLocalEverywhere

trait AuthenticationFilter extends SkinnyFilter with BeforeAfterActionFeature with MainThreadLocalEverywhere {

  beforeAction(except = Seq('typetalkLogin)) {
    session.get("currentUser").map { user =>
      set("currentUser", user)
    }.getOrElse(redirect(url(Controllers.session.typetalkLoginUrl)))
  }

}
