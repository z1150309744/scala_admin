package services

import javax.inject.{Inject, Singleton}

import dao.SysUserDAO
import models.{SysUser}

import scala.concurrent.Future

/**
  * title: SysUserService.java
  * package: services
  * Author: 邹文文
  * createDate: 2017年08月15 11:01
  * version: v1.0
  */
@Singleton
class SysUserService@Inject() (sysUserDAO: SysUserDAO){

  def listAllUsers: Future[Seq[SysUser]] = {
    sysUserDAO.list()
  }

}
