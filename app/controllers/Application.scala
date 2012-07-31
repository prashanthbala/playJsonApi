package controllers

import play.api._
import play.api.mvc._
import viewUtil.JsonUtil
import com.codahale.jerkson.Json._

object Application extends Controller with JsonUtil {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def json = Action{ //jsonApi("json") {
    Ok(generate[Message](Message("those bastards"))).as("text/javascript")
  }

}

case class Message(message: String)