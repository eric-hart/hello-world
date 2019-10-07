// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/crux/Templates/my-play-frame-work/conf/routes
// @DATE:Fri Jan 25 18:11:30 CST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseGreeting(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def greet(name:String): Call = {
    
      (name: @unchecked) match {
      
        // @LINE:6
        case (name) if name == "World" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("name", "World"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "greeting")
      
        // @LINE:7
        case (name)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "greeting/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
      
      }
    
    }
  
  }


}
