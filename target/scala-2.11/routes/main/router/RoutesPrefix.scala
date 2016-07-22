
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ouyangcharles/Projects/IdeaWorkspace/DemoPlay/conf/routes
// @DATE:Tue May 31 19:34:50 CST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
