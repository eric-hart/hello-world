// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/crux/Templates/my-play-frame-work/conf/routes
// @DATE:Fri Jan 25 18:11:30 CST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseGreeting(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def greet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Greeting.greet",
      """
        function(name0) {
        
          if (name0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("World") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "greeting"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "greeting/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
          }
        
        }
      """
    )
  
  }


}
