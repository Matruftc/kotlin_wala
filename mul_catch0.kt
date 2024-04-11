fun main()
{
try {
  val num = 10
  val res = num /0
}


catch(e: NullPointerException)
{
  println(e)
}

catch(e: ArithmeticException )
{
  println("Apun ne pakad lya")
}



finally {
  
  println("finally block always execute after the code")
}
}