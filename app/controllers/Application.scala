package controllers

import play.api._
import play.api.mvc._
import com.codahale.jerkson.Json

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def json = Action {
    Ok(Json.generate(Map("first" -> List(1,2,3)))).as("appliation/json")
  }
  
}