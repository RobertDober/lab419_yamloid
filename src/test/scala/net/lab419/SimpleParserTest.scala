package net.lab419

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

import net.lab419._

class SimpleParserTest extends FunSpec with ShouldMatchers {
  describe( "Parsing An Empty String" ){
    it ("returns an empty List") {
      val ast = SimpleParser.parse( "" )
      ast should be( List() )
    }
  }

  describe( "Parsing a simple key value pair" ){
  
    it ("returns a one element map") { 
      val ast = SimpleParser.parse( "a: 42" )
        ast should be (List(Map("a" -> 42 )))
    }
    
  }
}
