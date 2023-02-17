fun main(){
    val school= "akirachix"
    println(school[0]+""+school[2] +""+ school[3])
    greetPerson("Rebecca", 24)
    gettext("Bridget")
    getname("Rebecca")

    fun schoolname(name: String){
        val school= "akirachix"
    }
}
fun greetPerson(name: String, age: Int): String{
    var x = ("Hi, my name is $name and I am $age years old")
     println(x)
    return (x)
}

fun gettext(name: String){
println(name.length)

}
fun getname(name: String){
    if(name=="Juliana")
        println("Thats me!")
    else        println("I do not know who that is")
}