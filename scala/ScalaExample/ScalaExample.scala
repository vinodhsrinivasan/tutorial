object ScalaExample{

  def main(args: Array[String]): Unit = {
    println("welcome to scala")
    //fibanacci seris
    var previous=0
    var present=1
    println(previous)
    println(present)
    while(present<100){
      var fib =previous+present
      if(fib <=100){
        println(fib)
      }
      previous=present
      present=fib
    }
  }
}