object ScalaExample{

  def fibFun(n: Int): Int= {
    def fib_tail( n: Int, a:Int, b:Int): Int = n match {
      case 0 => a
      case _ => fib_tail( n-1, b, a+b )
    }
    return fib_tail( n, 0, 1)
  }

  def fibNonFun(limit: Int): Int = {
    var previous=0
    var present=1
    var fib=0
    while(present<limit){
      fib =previous+present
      previous=present
      present=fib
    }
    return fib
  }
  def main(args: Array[String]): Unit = {
    //println("welcome to scala")
    println("Non-Functional way - Fibonacci number: "+fibNonFun(100))
    println("Functional way - Fibonacci number: "+fibFun(100))
  }
}