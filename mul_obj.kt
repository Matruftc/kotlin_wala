class Car{
    var brand=""
    var model=""
    var year=0
}

fun main() {
val c1 = Car()
val c2 = Car()

c1.brand = "Ford"
c1.model = "mustang"
c1.year  = 1967

c2.brand = "Ford"
c2.model = "mustang"
c2.year  = 1989

println(c1.brand)
println(c1.model)
println(c1.year)

println(c2.brand)
println(c2.model)
println(c2.year)

}