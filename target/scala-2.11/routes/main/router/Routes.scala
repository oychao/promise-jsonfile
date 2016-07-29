
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ouyangcharles/git/DemoPlay/conf/routes
// @DATE:Fri Jul 29 13:39:32 JST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Assets_1: controllers.Assets,
  // @LINE:9
  UserController_0: controllers.UserController,
  // @LINE:19
  WebSocketController_2: controllers.WebSocketController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Assets_1: controllers.Assets,
    // @LINE:9
    UserController_0: controllers.UserController,
    // @LINE:19
    WebSocketController_2: controllers.WebSocketController
  ) = this(errorHandler, Assets_1, UserController_0, WebSocketController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_1, UserController_0, WebSocketController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/formSave""", """controllers.UserController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/save""", """controllers.UserController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/find""", """controllers.UserController.find()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/findAll""", """controllers.UserController.findAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/findSome""", """controllers.UserController.findSome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/delete/""" + "$" + """id<[^/]+>""", """controllers.UserController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/formModify/""" + "$" + """id<[^/]+>""", """controllers.UserController.pageModify(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/modify""", """controllers.UserController.modify()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v_ws""", """controllers.WebSocketController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ws""", """controllers.WebSocketController.ws"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/formSave")))
  )
  private[this] lazy val controllers_UserController_index1_invoker = createInvoker(
    UserController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      """ User Mapping Info""",
      this.prefix + """user/formSave"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_save2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/save")))
  )
  private[this] lazy val controllers_UserController_save2_invoker = createInvoker(
    UserController_0.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """user/save"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_find3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/find")))
  )
  private[this] lazy val controllers_UserController_find3_invoker = createInvoker(
    UserController_0.find(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "find",
      Nil,
      "GET",
      """""",
      this.prefix + """user/find"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_findAll4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/findAll")))
  )
  private[this] lazy val controllers_UserController_findAll4_invoker = createInvoker(
    UserController_0.findAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "findAll",
      Nil,
      "GET",
      """""",
      this.prefix + """user/findAll"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_findSome5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/findSome")))
  )
  private[this] lazy val controllers_UserController_findSome5_invoker = createInvoker(
    UserController_0.findSome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "findSome",
      Nil,
      "GET",
      """""",
      this.prefix + """user/findSome"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_delete6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_delete6_invoker = createInvoker(
    UserController_0.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """user/delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_pageModify7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/formModify/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_pageModify7_invoker = createInvoker(
    UserController_0.pageModify(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "pageModify",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """user/formModify/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_modify8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/modify")))
  )
  private[this] lazy val controllers_UserController_modify8_invoker = createInvoker(
    UserController_0.modify(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "modify",
      Nil,
      "POST",
      """""",
      this.prefix + """user/modify"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_WebSocketController_index9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v_ws")))
  )
  private[this] lazy val controllers_WebSocketController_index9_invoker = createInvoker(
    WebSocketController_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebSocketController",
      "index",
      Nil,
      "GET",
      """ Web Socket Demo""",
      this.prefix + """v_ws"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_WebSocketController_ws10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ws")))
  )
  private[this] lazy val controllers_WebSocketController_ws10_invoker = createInvoker(
    WebSocketController_2.ws,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebSocketController",
      "ws",
      Nil,
      "GET",
      """""",
      this.prefix + """ws"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:9
    case controllers_UserController_index1_route(params) =>
      call { 
        controllers_UserController_index1_invoker.call(UserController_0.index())
      }
  
    // @LINE:10
    case controllers_UserController_save2_route(params) =>
      call { 
        controllers_UserController_save2_invoker.call(UserController_0.save())
      }
  
    // @LINE:11
    case controllers_UserController_find3_route(params) =>
      call { 
        controllers_UserController_find3_invoker.call(UserController_0.find())
      }
  
    // @LINE:12
    case controllers_UserController_findAll4_route(params) =>
      call { 
        controllers_UserController_findAll4_invoker.call(UserController_0.findAll())
      }
  
    // @LINE:13
    case controllers_UserController_findSome5_route(params) =>
      call { 
        controllers_UserController_findSome5_invoker.call(UserController_0.findSome())
      }
  
    // @LINE:14
    case controllers_UserController_delete6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_delete6_invoker.call(UserController_0.delete(id))
      }
  
    // @LINE:15
    case controllers_UserController_pageModify7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_pageModify7_invoker.call(UserController_0.pageModify(id))
      }
  
    // @LINE:16
    case controllers_UserController_modify8_route(params) =>
      call { 
        controllers_UserController_modify8_invoker.call(UserController_0.modify())
      }
  
    // @LINE:19
    case controllers_WebSocketController_index9_route(params) =>
      call { 
        controllers_WebSocketController_index9_invoker.call(WebSocketController_2.index())
      }
  
    // @LINE:20
    case controllers_WebSocketController_ws10_route(params) =>
      call { 
        controllers_WebSocketController_ws10_invoker.call(WebSocketController_2.ws)
      }
  }
}
