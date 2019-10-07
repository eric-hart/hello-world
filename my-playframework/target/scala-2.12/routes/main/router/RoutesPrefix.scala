// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/crux/Templates/my-play-frame-work/conf/routes
// @DATE:Fri Jan 25 18:11:30 CST 2019


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
