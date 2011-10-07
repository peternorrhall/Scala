package se.extenda.scala

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Before
import org.junit.Assert._
import org.junit.Test
import org.scalatest.junit.JUnitSuite

class ChopTest extends JUnitSuite {

  var ch: Chop = _
  
  @Before def initialize() {
    ch = new Chop()
  }
  
  @Test def verifyChop() { // Uses JUnit-style assertions
    val testArr = Array[Int](1, 2, 3, 4, 5, 6)
    assertEquals(2, ch.chop(3, testArr))
    
    assertEquals(-1, ch.chop(3, Array[Int]()))
    assertEquals(-1, ch.chop(3, Array(1)))
    assertEquals(0, ch.chop(1, Array(1)))
    
    
    assertEquals(0,  ch.chop(1, Array(1,3,5)))
    assertEquals(1,  ch.chop(3, Array(1,3,5)))
    assertEquals(2,  ch.chop(5, Array(1,3,5)))
    assertEquals(-1, ch.chop(0, Array(1,3,5)))
    assertEquals(-1, ch.chop(2, Array(1,3,5)))
    assertEquals(-1, ch.chop(4, Array(1,3,5)))
    assertEquals(-1, ch.chop(6, Array(1,3,5)))    
  }
}