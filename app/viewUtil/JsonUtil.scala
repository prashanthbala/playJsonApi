package viewUtil

import play.api.mvc._
import com.codahale.jerkson.Json._
import play.api.mvc._

/**
 * Created with IntelliJ IDEA.
 * User: Prashanth
 * Date: 7/29/12
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */

trait JsonUtil extends Controller {

    class JSONSerializationException(message: String) extends IllegalArgumentException

    def jsonApi[A](title: String) (response : => A) = {
      Action {
        canSerialize[A](Manifest.classType(response.getClass)) match {
          case true => Ok(views.html.json(generate[A](response),title))
          case false => throw new JSONSerializationException("Not a valid serlizable object")
        }
      }
    }
}
