
package net.lab419

object SimpleParser{
  // content : String from file
  // -> AST
  def parse(content: String) : List[ Object ]  = {
    val strings = content split "\n"
    parseList( strings.toList filterNot( _.isEmpty ) )
  }

  // l: List of lines
  // -> AST
  def parseList( l: List[String] ) : List[ Object ] = {
    l match {
      case Nil => Nil
      case List() => Nil
      case _ => parseGrouped( l )
    }
  }

  // l: List of lines, *not empty*
  // -> AST
  def parseGrouped( l: List[String] ): List[ Object] = {
    // That seems like a stupid way to do this
    val indent = l indexWhere (_ != ' ')
    val groups = getGroups( l, indent )
    List(Map( "a" -> 42 ))
  }


  def getGroups( l: List[String], indent: Int ) : List[String] = {
    List()
  }
}
