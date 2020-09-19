
///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
// Assignment_Q2
//Write an object Conversions with methods inchestoFeet, milestoKms 
//and poundsToKilos and invoke its methods from a class of your choice

class convrsion_type {
  private var value = 0.0
  def inchestoFeet(a:Double = 1.0):Double={
    value = (a/12)
    return value
  }
  def milestoKms(b:Double = 1.0):Double={
    value = b*1.609344
    return value
  }
  def poundsToKilos(c:Double = 1.0):Double={
    value = c*0.45359237 
    return value
  }
}

object conversion{
  def main(Args:Array[String]){
    var convrsion_type = new convrsion_type()
    println("Inches to feet is :" + convrsion_type.inchestoFeet(10))
    println("Miles to Kms is :" + convrsion_type.milestoKms(10)) 
    println("Pounds to Kilos is :" + convrsion_type.poundsToKilos(10)) 
  }
}


///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
