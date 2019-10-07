package controllers

import com.google.inject.Inject
import com.google.inject.Singleton

import play.api.libs.json.JsValue
import play.api.libs.json.Json

import play.api.mvc.AbstractController
import play.api.mvc.ControllerComponents
import play.api.mvc.Action

/**
 * @class
 */
@Singleton
class Greeting @Inject()(controller: ControllerComponents)
  extends AbstractController(controller) {

  /**
   * @method
   */
  def greet(name: String) = Action { implicit request =>
    Ok(Json.obj(
      "content" -> s"Hello $name"
    ))
  }
}
