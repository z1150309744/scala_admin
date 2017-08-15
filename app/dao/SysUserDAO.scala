package dao

import javax.inject.{Inject, Singleton}

import models.SysUser
import scala.concurrent.{ExecutionContext, Future}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile


/**
  * title: SysUserDAO.java
  * package: dao
  * Author: 邹文文
  * createDate: 2017年08月15 10:15
  * version: v1.0
  */
@Singleton
class SysUserDAO@Inject() (protected val dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext)
  extends HasDatabaseConfigProvider[JdbcProfile] {
  import profile.api._
  private val SysUsers = TableQuery[SysUserTable]

  def list(): Future[Seq[SysUser]] = db.run(SysUsers.result)

  def insert(sysUser: SysUser): Future[Unit] = db.run(SysUsers += sysUser).map { _ => () }


  private class SysUserTable(tag: Tag) extends Table[SysUser](tag, "sys_user") {
    def id = column[String]("id")
    def realname = column[String]("realname")
    def username = column[String]("username")
    def portrait = column[String]("portrait")
    def password = column[String]("password")
    def email = column[String]("email")
    def phone = column[String]("phone")
    def status = column[Int]("status")
    def create_by = column[String]("create_by")
    def create_date = column[Long]("create_date")
    def update_by = column[Option[String]]("update_by")
    def update_date = column[Option[Long]]("update_date")
    def remarks = column[Option[String]]("remarks")


    def * = (id, realname, username, portrait, password, email, phone, status, create_by, create_date, update_by, update_date, remarks) <> ((SysUser.apply _).tupled, SysUser.unapply)
  }

}
