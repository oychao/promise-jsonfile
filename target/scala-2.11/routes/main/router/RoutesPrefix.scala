
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ouyangcharles/git/DemoPlay/conf/routes
// @DATE:Fri Jul 29 13:39:32 JST 2016


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
