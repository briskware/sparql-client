package com.modelfabric.sparql.spray.client

object SparqlClientType extends Enumeration {

  type SparqlClientType = Value

  val HttpJena = Value
  val HttpSpray = Value
  //val StardogJena = Value
}