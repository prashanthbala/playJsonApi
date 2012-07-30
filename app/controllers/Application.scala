package controllers

import play.api._
import play.api.mvc._
import viewUtil.JsonUtil

object Application extends Controller with JsonUtil {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def json = jsonApi("json") {
     List[Int](1,2,3)
  }
  
}