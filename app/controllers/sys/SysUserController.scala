package controllers.sys

import javax.inject.{Inject, Singleton}

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}
import services.SysUserService

import scala.concurrent.{ExecutionContext, Future}

/**
  * title: SysUserController.java
  * package: controllers.sys
  * Author: 邹文文
  * createDate: 2017年08月15 11:07
  * version: v1.0
  */
@Singleton
class SysUserController@Inject() (sysUserService: SysUserService, controllerComponents: ControllerComponents)(implicit executionContext: ExecutionContext) extends AbstractController(controllerComponents) {
  def index = Action.async { implicit request =>
    sysUserService.listAllUsers map { user =>
      Ok(Json.toJson(user))
    }
  }
}
