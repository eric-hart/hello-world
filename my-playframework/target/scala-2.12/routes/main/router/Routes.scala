// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/crux/Templates/my-play-frame-work/conf/routes
// @DATE:Fri Jan 25 18:11:30 CST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Greeting_0: controllers.Greeting,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Greeting_0: controllers.Greeting
  ) = this(errorHandler, Greeting_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Greeting_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """greeting""", """controllers.Greeting.greet(name:String = "World")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """greeting/""" + "$" + """name<[^/]+>""", """controllers.Greeting.greet(name:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Greeting_greet0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("greeting")))
  )
  private[this] lazy val controllers_Greeting_greet0_invoker = createInvoker(
    Greeting_0.greet(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Greeting",
      "greet",
      Seq(classOf[String]),
      "GET",
      this.prefix + """greeting""",
      """ An example controller showing a greeting message.""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Greeting_greet1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("greeting/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Greeting_greet1_invoker = createInvoker(
    Greeting_0.greet(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Greeting",
      "greet",
      Seq(classOf[String]),
      "GET",
      this.prefix + """greeting/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Greeting_greet0_route(params@_) =>
      call(Param[String]("name", Right("World"))) { (name) =>
        controllers_Greeting_greet0_invoker.call(Greeting_0.greet(name))
      }
  
    // @LINE:7
    case controllers_Greeting_greet1_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Greeting_greet1_invoker.call(Greeting_0.greet(name))
      }
  }
}
