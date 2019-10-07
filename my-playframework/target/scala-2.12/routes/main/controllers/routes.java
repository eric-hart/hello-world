// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/crux/Templates/my-play-frame-work/conf/routes
// @DATE:Fri Jan 25 18:11:30 CST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseGreeting Greeting = new controllers.ReverseGreeting(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseGreeting Greeting = new controllers.javascript.ReverseGreeting(RoutesPrefix.byNamePrefix());
  }

}
