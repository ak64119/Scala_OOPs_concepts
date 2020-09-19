///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////

// Class_and_Object Example

class Counter {
   private var count = 0 // Must initialize
   def inc() {
      count += 1
   }

   def currentVal() = { count }
}

object CounterExample {
   def main(args: Array[String]) {
      // Creating object of class Counter.
      val count = new Counter()
      println("Old Counter Value :" + count.currentVal()) 
      count.inc() 
      count.inc() 
      println("New Counter Value :" + count.currentVal())
   }
}

///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////