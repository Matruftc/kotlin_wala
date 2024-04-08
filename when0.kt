// instead of write so many if else we wrote "when"
fun main(){
val day = 4

val result = when (day)
{
    1-> "Monday"
    2-> "Tuesday"
    3-> "Wednesday"
    4-> "Thursday"
    5-> "Friday"
    6-> "Saturday"
    7-> "Sunday"

    else -> "invalid day."
}

println(result)

}