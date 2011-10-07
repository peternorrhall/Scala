package se.extenda.scala

class Chop {
	def chop(x:Int, arr:Array[Int]): Int = {
	  var i = 0
	  while (i < arr.length) {
	    if (arr(i) == x) {
	      return i
	    }
	    i += 1
	  }
	  return -1
	}
}