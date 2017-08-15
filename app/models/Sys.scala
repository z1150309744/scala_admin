package models

import org.joda.time.DateTime
import play.api.libs.json.Json

/**
  * title: SysUser.scala
  * package: models
  * Author: 邹文文
  * createDate: 2017年08月15 9:55
  * version: v1.0
  */
//case class Page[A](items: Seq[A], page: Int, offset: Long, total: Long) {
//  lazy val prev = Option(page - 1).filter(_ >= 0)
//  lazy val next = Option(page + 1).filter(_ => (offset + items.size) < total)
//}

case class SysUser(id: String, realname: String, username: String, portrait: String, password: String,
                   email: String, phone: String, status: Int, create_by: String, create_date: Long, update_by: Option[String],
                   update_date: Option[Long], remarks: Option[String])

case class SysRole(id: String, name: String, code: String, usable: Int, create_by: String, create_date: Long, update_by: String,
                   update_date: Long, remarks: String, del_flag: String)

object SysUser {
  implicit val sysUserFormat = Json.format[SysUser]
}
object SysRole {
  implicit val sysRoleFormat = Json.format[SysRole]
}
