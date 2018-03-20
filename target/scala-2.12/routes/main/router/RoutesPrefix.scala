
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab6/conf/routes
// @DATE:Tue Mar 20 16:04:29 GMT 2018


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
