package se.extenda.scala

class ScalaObjectClass {
	def a(): Int = {
	  2
	}
}

object ScalaObjectClass {
  def myfunc() = {
    val a = new ScalaObjectClass
    println(a.a());
  }
}