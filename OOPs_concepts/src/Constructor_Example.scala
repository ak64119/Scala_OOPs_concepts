
///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////

class Person(val firstName: String, val lastName: String, val age: Int) {
   // Auxiliary constructor.
   def this(firstName: String, lastName: String) {
      this(firstName, lastName, 0); // Calling the primary constructor.
   }
}

object AuxiliaryConstructor {
   def main(args: Array[String]) {
      // Use the primary constructor
      val person1= new Person("Prakash", "Pr", 29)
      println(person1.firstName)

     // Use a Auxiliary constructor 
     val person2= new Person("Fred", "Thomas") 
     println(person2.firstName)
  }
}

///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////