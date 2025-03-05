package controllers

import domain.services.ConnectionService
import play.api.libs.json.{JsString, Json}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

import java.util.UUID
import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success, Try}

@Singleton
class ConnectionController @Inject()(
    val controllerComponents: ControllerComponents,
    connectionService: ConnectionService
)(implicit val ec: ExecutionContext)
    extends BaseController {

  def getConnection(connectionId: String): Action[AnyContent] = Action.async {
    Try {
      UUID.fromString(connectionId)
    } match {
      case Failure(exception) =>
        Future.successful(
          InternalServerError(Json.obj("message" -> "Connection ID is not parsable to UUID"))
        )
      case Success(connectionUUId) =>
        connectionService
          .findById(connectionUUId)
          .map {
            case Left(error)       => NotFound(Json.obj("message" -> JsString("Error")))
            case Right(connection) => Ok(Json.toJson(connection))
          }
          .recover { case ex =>
            InternalServerError(Json.obj("message" -> s"An unexpected error occurred: ${ex.getMessage}"))
          }
    }
  }
}
