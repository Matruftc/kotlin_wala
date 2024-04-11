fun main (){

    try{
      
    val a = IntArray(5)
    a[5]=10/0
    }
      catch ( e: NumberFormatException)
      {
        0
      }
      
      catch( e: ArrayIndexOutOfBoundsException)
      {
        println("It is array index out of bounds")
        
      }
      
      catch(e : ArithmeticException)
      {
        println("Its ArithmeticException")
      }
      
      println("code get the catch Enjoy!!")
    }