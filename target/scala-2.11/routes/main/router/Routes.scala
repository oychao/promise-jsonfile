
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ouyangcharles/git/DemoPlay/conf/routes
// @DATE:Tue Jul 26 18:39:12 JST 2016

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
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_5: controllers.Assets,
  // @LINE:16
  FrameController_3: controllers.FrameController,
  // @LINE:21
  UserController_4: controllers.UserController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_5: controllers.Assets,
    // @LINE:16
    FrameController_3: controllers.FrameController,
    // @LINE:21
    UserController_4: controllers.UserController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_5, FrameController_3, UserController_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_5, FrameController_3, UserController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.FrameController.frame()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.FrameController.dashboard()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statistics""", """controllers.FrameController.statistics()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/formSave""", """controllers.UserController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/save""", """controllers.UserController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/find""", """controllers.UserController.find()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/findAll""", """controllers.UserController.findAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/findSome""", """controllers.UserController.findSome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/delete/""" + "$" + """id<[^/]+>""", """controllers.UserController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/formModify/""" + "$" + """id<[^/]+>""", """controllers.UserController.pageModify(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/modify""", """controllers.UserController.modify()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:16
  private[this] lazy val controllers_FrameController_frame4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_FrameController_frame4_invoker = createInvoker(
    FrameController_3.frame(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FrameController",
      "frame",
      Nil,
      "GET",
      """ Frame Mapping Info""",
      this.prefix + """index"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_FrameController_dashboard5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_FrameController_dashboard5_invoker = createInvoker(
    FrameController_3.dashboard(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FrameController",
      "dashboard",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_FrameController_statistics6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics")))
  )
  private[this] lazy val controllers_FrameController_statistics6_invoker = createInvoker(
    FrameController_3.statistics(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FrameController",
      "statistics",
      Nil,
      "GET",
      """""",
      this.prefix + """statistics"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_UserController_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/formSave")))
  )
  private[this] lazy val controllers_UserController_index7_invoker = createInvoker(
    UserController_4.index(),
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

  // @LINE:22
  private[this] lazy val controllers_UserController_save8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/save")))
  )
  private[this] lazy val controllers_UserController_save8_invoker = createInvoker(
    UserController_4.save(),
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

  // @LINE:23
  private[this] lazy val controllers_UserController_find9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/find")))
  )
  private[this] lazy val controllers_UserController_find9_invoker = createInvoker(
    UserController_4.find(),
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

  // @LINE:24
  private[this] lazy val controllers_UserController_findAll10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/findAll")))
  )
  private[this] lazy val controllers_UserController_findAll10_invoker = createInvoker(
    UserController_4.findAll(),
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

  // @LINE:25
  private[this] lazy val controllers_UserController_findSome11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/findSome")))
  )
  private[this] lazy val controllers_UserController_findSome11_invoker = createInvoker(
    UserController_4.findSome(),
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

  // @LINE:26
  private[this] lazy val controllers_UserController_delete12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_delete12_invoker = createInvoker(
    UserController_4.delete(fakeValue[Long]),
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

  // @LINE:27
  private[this] lazy val controllers_UserController_pageModify13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/formModify/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_pageModify13_invoker = createInvoker(
    UserController_4.pageModify(fakeValue[Long]),
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

  // @LINE:28
  private[this] lazy val controllers_UserController_modify14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/modify")))
  )
  private[this] lazy val controllers_UserController_modify14_invoker = createInvoker(
    UserController_4.modify(),
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_FrameController_frame4_route(params) =>
      call { 
        controllers_FrameController_frame4_invoker.call(FrameController_3.frame())
      }
  
    // @LINE:17
    case controllers_FrameController_dashboard5_route(params) =>
      call { 
        controllers_FrameController_dashboard5_invoker.call(FrameController_3.dashboard())
      }
  
    // @LINE:18
    case controllers_FrameController_statistics6_route(params) =>
      call { 
        controllers_FrameController_statistics6_invoker.call(FrameController_3.statistics())
      }
  
    // @LINE:21
    case controllers_UserController_index7_route(params) =>
      call { 
        controllers_UserController_index7_invoker.call(UserController_4.index())
      }
  
    // @LINE:22
    case controllers_UserController_save8_route(params) =>
      call { 
        controllers_UserController_save8_invoker.call(UserController_4.save())
      }
  
    // @LINE:23
    case controllers_UserController_find9_route(params) =>
      call { 
        controllers_UserController_find9_invoker.call(UserController_4.find())
      }
  
    // @LINE:24
    case controllers_UserController_findAll10_route(params) =>
      call { 
        controllers_UserController_findAll10_invoker.call(UserController_4.findAll())
      }
  
    // @LINE:25
    case controllers_UserController_findSome11_route(params) =>
      call { 
        controllers_UserController_findSome11_invoker.call(UserController_4.findSome())
      }
  
    // @LINE:26
    case controllers_UserController_delete12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_delete12_invoker.call(UserController_4.delete(id))
      }
  
    // @LINE:27
    case controllers_UserController_pageModify13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_pageModify13_invoker.call(UserController_4.pageModify(id))
      }
  
    // @LINE:28
    case controllers_UserController_modify14_route(params) =>
      call { 
        controllers_UserController_modify14_invoker.call(UserController_4.modify())
      }
  }
}
