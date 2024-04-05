class car(var brand: String, var model:String,var year:Int)
{
    fun drive(){
        println("vrooooomm!!!")
    }
}

fun main(){
    val c1= car("ford","mustang",1879)
    val c2= car("ford","vern",1809)
    val c3= car("ford","vyg",1869)

    println(c1.brand)
    println(c1.model)
    println(c1.year)
    println("...................")
    c1.drive()

}