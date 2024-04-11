fun main()
{
    try{
        val data = 20/0

    }

    catch (e : ArithmeticException)
    {
        println(e)
    }

    println("Code Below Exception")
}