import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Your age please")
    
    try{
      var age = scanner.nextInt()
      println("your age is $age")
    }
    
    
    catch(e: InputMismatchException)
    {
      println("KAr le print")
    }
    
    finally{
    scanner.close()
}
}