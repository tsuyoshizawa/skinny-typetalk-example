package controller

import skinny._
import skinny.filter.ErrorPageFilter
import _root_.filter.AuthenticationFilter

/**
 * The base controller for this Skinny application.
 *
 * see also "http://skinny-framework.org/documentation/controller-and-routes.html"
 */
trait ApplicationController extends SkinnyController
    // with TxPerRequestFilter
    // with SkinnySessionFilter
    with ErrorPageFilter
    with AuthenticationFilter {

  // override def defaultLocale = Some(new java.util.Locale("ja"))

}
