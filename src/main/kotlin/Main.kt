fun main(){
    namesArray()
    countryArray()
    manyArray()
    val names =nameyArray("Audi","Lucid","Aston")

}

//create an array that takes in 4str and create an array out of them then prints out.
fun namesArray(){
    val names = arrayOf("curious","loving","precious","kind")
    println(names.contentToString())
}

//create a function that prints the name in the correct grammatically order
fun countryArray() {
    val cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println(cities.map { it.capitalize() })
}

//create a function that prints 2nd and 5th element
fun manyArray(){
    val number = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(number[2].plus(number[5]))
    println(number.indexOf(158))
    println(number.contentToString())
}

//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun nameyArray(nam1:String,nam2:String,nam3:String):String{
    val names = arrayOf(nam1,nam2,nam3)
    return names.contentToString()
}






