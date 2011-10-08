package se.extenda.scala;
object HelloApp {
  def main(args : Array[String]) : Unit = {
    var ch = new Chop
    var i = 2
    i = ch.chop(2, Array(1,2,3,4,5))
    println(i)
    
    ScalaObjectClass.myfunc();
  }
}
