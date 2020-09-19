///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
// Assignment_Q6
// Write a Scala code which reverses the lines of a file (makes the 
// first line as the last one, and so on)

import scala.io.Source

class Read_reverse_line {
  def readfile(filename:String):Seq[String] = {
    val bufferedSource = Source.fromFile(filename)
    val lines = (for (line <- bufferedSource.getLines()) yield line).toList
    bufferedSource.close
    return lines.reverse
  }
}

object Rvrse_lines{
  def main(Args:Array[String]){
    var get_lines = new Read_reverse_line()
    var rev_lns = get_lines.readfile("E:/New Volume/Academic/Edureka/Apache_Spark/Scala-Examples/sample_text.txt")
    for (i <- rev_lns)
      println(i)  
  }
  
}

///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////