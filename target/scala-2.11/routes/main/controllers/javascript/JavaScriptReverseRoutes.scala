
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ouyangcharles/git/DemoPlay/conf/routes
// @DATE:Tue Jul 26 18:39:12 JST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:27
    def pageModify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.pageModify",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/formModify/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:25
    def findSome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.findSome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/findSome"})
        }
      """
    )
  
    // @LINE:23
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.find",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/find"})
        }
      """
    )
  
    // @LINE:28
    def modify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.modify",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/modify"})
        }
      """
    )
  
    // @LINE:24
    def findAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.findAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/findAll"})
        }
      """
    )
  
    // @LINE:22
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/save"})
        }
      """
    )
  
    // @LINE:21
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/formSave"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseFrameController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def dashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FrameController.dashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
    // @LINE:16
    def frame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FrameController.frame",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
        }
      """
    )
  
    // @LINE:18
    def statistics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FrameController.statistics",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics"})
        }
      """
    )
  
  }


}
