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

//Exception occur but not handelled

finally {
  
  println("finally block always execute after the code")
}
}