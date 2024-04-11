fun main()
{
try {
  val num = 10
  val res = num /5
}


catch(e: NullPointerException)
{
  println(e)
}

finally {
  
  println("finally block always execute after the code")
}
}