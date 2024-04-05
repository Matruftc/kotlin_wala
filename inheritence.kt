open class MyParentClass{
    val x =5
}

class MyChilClass : MyParentClass(){
    fun myfun(){
        println(x)
    }
}

fun main(){
    val iamobj=MyChilClass()
    iamobj.myfun()
}