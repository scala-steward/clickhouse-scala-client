package com.crobox.clickhouse.dsl.column

import java.util.UUID

import com.crobox.clickhouse.dsl._
import org.joda.time.{DateTime, LocalDate}

trait DictionaryFunctions { self: Magnets =>

  sealed abstract class DictionaryGetFuncColumn[V](val dictName: StringColMagnet[_], val attrName: StringColMagnet[_], val id: ConstOrColMagnet[_], val default: Option[Magnet[V]] = None) extends
    DictionaryFuncColumn[V]

  sealed abstract class DictionaryFuncColumn[V] extends
    ExpressionColumn[V](EmptyColumn())

  //TODO :magnetize default params

  case class DictGetUInt8(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[Long]] = None)
    extends DictionaryGetFuncColumn[Long](_dictName,_attrName,_id,_default)
  case class DictGetUInt16(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[Long]] = None)
    extends DictionaryGetFuncColumn[Long](_dictName,_attrName,_id,_default)
  case class DictGetUInt32(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[Long]] = None)
    extends DictionaryGetFuncColumn[Long](_dictName,_attrName,_id,_default)
  case class DictGetUInt64(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[Long]] = None)
    extends DictionaryGetFuncColumn[Long](_dictName,_attrName,_id,_default)
  case class DictGetInt8(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[Long]] = None)
    extends DictionaryGetFuncColumn[Long](_dictName,_attrName,_id,_default)
  case class DictGetInt16(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[Long]] = None)
    extends DictionaryGetFuncColumn[Long](_dictName,_attrName,_id,_default)
  case class DictGetInt32(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[Long]] = None)
    extends DictionaryGetFuncColumn[Long](_dictName,_attrName,_id,_default)
  case class DictGetInt64(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[Long]] = None)
    extends DictionaryGetFuncColumn[Long](_dictName,_attrName,_id,_default)
  case class DictGetFloat32(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[Float]] = None)
    extends DictionaryGetFuncColumn[Float](_dictName,_attrName,_id,_default)
  case class DictGetFloat64(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[Float]] = None)
    extends DictionaryGetFuncColumn[Float](_dictName,_attrName,_id,_default)
  case class DictGetDate(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[LocalDate]] = None)
    extends DictionaryGetFuncColumn[LocalDate](_dictName,_attrName,_id,_default)
  case class DictGetDateTime(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[DateTime]] = None)
    extends DictionaryGetFuncColumn[DateTime](_dictName,_attrName,_id,_default)
  case class DictGetUUID(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[UUID]] = None)
    extends DictionaryGetFuncColumn[UUID](_dictName,_attrName,_id,_default)
  case class DictGetString(_dictName: StringColMagnet[_], _attrName: StringColMagnet[_], _id: ConstOrColMagnet[_], _default: Option[Magnet[String]] = None)
    extends DictionaryGetFuncColumn[String](_dictName,_attrName,_id,_default)

  case class DictIsIn(dictName: StringColMagnet[_], childId: ConstOrColMagnet[_], ancestorId: ConstOrColMagnet[_]) extends DictionaryFuncColumn[Boolean]
  case class DictGetHierarchy(dictName: StringColMagnet[_], id: ConstOrColMagnet[_]) extends DictionaryFuncColumn[String]
  case class DictHas(dictName: StringColMagnet[_], id: ConstOrColMagnet[_]) extends DictionaryFuncColumn[Boolean]


  //todo implement '...orDefault'
  def dictGetUInt8 (dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetUInt8(dictName, attrName, id)
  def dictGetUInt16(dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetUInt16(dictName, attrName, id)
  def dictGetUInt32(dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetUInt32(dictName, attrName, id)
  def dictGetUInt64(dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetUInt64(dictName, attrName, id)
  def dictGetInt8  (dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetInt8(dictName, attrName, id)
  def dictGetInt16 (dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetInt16(dictName, attrName, id)
  def dictGetInt32 (dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetInt32(dictName, attrName, id)
  def dictGetInt64 (dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetInt64(dictName, attrName, id)
  def dictGetFloat32(dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetFloat32(dictName, attrName, id)
  def dictGetFloat64(dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetFloat64(dictName, attrName, id)
  def dictGetDate  (dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetDate(dictName, attrName, id)
  def dictGetDateTime(dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetDateTime(dictName, attrName, id)
  def dictGetUUID  (dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetUUID(dictName, attrName, id)
  def dictGetString(dictName: StringColMagnet[_], attrName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetString(dictName, attrName, id)
  def dictIsIn     (dictName: StringColMagnet[_], childId: ConstOrColMagnet[_], id: ConstOrColMagnet[_]) = DictIsIn(dictName, childId, id)
  def dictGetHierarchy(dictName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictGetHierarchy(dictName, id)
  def dictHas      (dictName: StringColMagnet[_], id: ConstOrColMagnet[_]) = DictHas(dictName, id)
/*
dictGetUInt8
dictGetUInt16
dictGetUInt32
dictGetUInt64
dictGetInt8
dictGetInt16
dictGetInt32
dictGetInt64
dictGetFloat32
dictGetFloat64
dictGetDate
dictGetDateTime
dictGetUUID
dictGetString
dictGetTOrDefault
dictIsIn
dictGetHierarchy
dictHas
 */
}
