package se.extenda.scala

import org.scalatest.Spec
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class ChipBDD extends FlatSpec with ShouldMatchers {

  var ch: Chop = _
  
  "En Chop med tom array" should "returnera -1" in {
      ch = new Chop()
      ch.chop(3, Array[Int]()) should be (-1)
    }

  it should ("ska returnera -1 om det efterfrågade elementet inte finns") in {
      ch = new Chop()
      ch.chop(3, Array[Int](1)) should be (-1)
  }
  
}