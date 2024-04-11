import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    
    val name = scanner.next()
    println("Enter Your Name: ")

    val age = scanner.nextInt()
    println("Your  name and age is $name is $age")    
    
    scanner.close()
}
