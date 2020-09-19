///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
// Assignment_Q7
//Write a Scala code which reads a file and prints all words with 
//more than 10 characters. Can you write all of it in a single line?

import scala.io.Source

class ten_chrctr_wrds {
  def read_file(filename:String) = {
    val bufferedSource = Source.fromFile(filename)
    val words =  bufferedSource.getLines.flatMap(_.split("\\W+")).toList
    bufferedSource.close
    val lrge_words = words.filter(x => x.length > 10)
    println(lrge_words.mkString(" "))
  } 
}

object print_large_words{
  def main(Args:Array[String]){
    var prnt_wrds = new ten_chrctr_wrds()
    prnt_wrds.read_file("E:/New Volume/Academic/Edureka/Apache_Spark/Scala-Examples/sample_text.txt")
  }
}

///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////