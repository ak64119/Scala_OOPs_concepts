///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
//Assignment_Q4
//Write a Scala program to get the largest element of an array using
// reduceLeft

class ArrayMaxElmnt(){
  private var max_val = 0
  def find_max_val(arr: Array[Int]):Int = {
    max_val = arr.reduceLeft(_ max _)
    return max_val
  }
}

object arry_find_mx_val{
  def main(Args: Array[String]){
  val mx_ele = new ArrayMaxElmnt()
  println("The max value is :" + mx_ele.find_max_val(Array(1,-50,3,4,5,999,7,8,9)))
  }
}
///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
