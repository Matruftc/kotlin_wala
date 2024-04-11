fun main()
{
val nume = intArrayOf(4,8,16,32,64,128,256,512)
val deno = intArrayOf(2,0,4,4,0,8)

try{
  for (i in nume.indices){
    try 
     {
        println(nume[i].toString()+"/"+deno[i]+"is"+nume[i]/deno[i])
     }
     catch (e: ArithmeticException){
     println("PAkad liya apun nai!!")
  }
}
}
catch(e: ArrayIndexOutOfBoundsException)
{
  println("Element not found")
}
}