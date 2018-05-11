package controllers

import javax.inject._

import play.api.i18n.I18nSupport
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import view.html._

import scala.util.Random

case class LoginRequest(deviceId: String, linkCode: String, username: String, password: String)

@Singleton
class DeviceLinkController @Inject()(components: ControllerComponents) extends AbstractController(components) with I18nSupport {

  val AUTH_KEY_FORMAT = "user:%s@acmeMusic_%s"

  private val loginRequestForm = Form(
    mapping(
      "deviceId" -> text,
      "linkCode" -> text,
      "username" -> text,
      "password" -> text
    )(LoginRequest.apply)(LoginRequest.unapply)
  )
  def home(): Action[AnyContent] = Action { implicit request =>
    val maybeLinkCode = request.getQueryString("linkCode").filterNot(_ == "")
    Ok(enterCode(maybeLinkCode.getOrElse(""), None))
  }

  def login(): Action[AnyContent] = Action { implicit request =>
    loginRequestForm.bindFromRequest.fold(
      _ => BadRequest(""),
      loginRequest =>

        if(!validateDeviceCredentials(loginRequest.deviceId, loginRequest.linkCode)){
          BadRequest("blahblac")
        }
        else if(!validateUserCredentials(loginRequest.username, loginRequest.password)){
          BadRequest("blahblac")
        }
        else {
//          val privateKey = String.format(AUTH_KEY_FORMAT, loginRequest.username, Random.alphanumeric.take(5))
          Ok(saved(loginRequest.username, "authToken"))
        }
    )
  }

  private def validateDeviceCredentials(deviceId: String, linkCode: String): Boolean = true
  private def validateUserCredentials(username: String, password: String): Boolean = true

}