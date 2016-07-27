
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ouyangcharles/git/DemoPlay/conf/routes
// @DATE:Tue Jul 26 18:39:12 JST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:21
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "user/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:27
    def pageModify(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "user/formModify/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:25
    def findSome(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "user/findSome")
    }
  
    // @LINE:23
    def find(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "user/find")
    }
  
    // @LINE:28
    def modify(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "user/modify")
    }
  
    // @LINE:24
    def findAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "user/findAll")
    }
  
    // @LINE:22
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "user/save")
    }
  
    // @LINE:21
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "user/formSave")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:16
  class ReverseFrameController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def dashboard(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:16
    def frame(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "index")
    }
  
    // @LINE:18
    def statistics(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "statistics")
    }
  
  }


}
