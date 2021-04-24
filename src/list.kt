fun main(){
    println(isEven(24))

    var product=Product("Geisha",30,200.00.toFloat(),"hygiene")
    product.check()

    println(sortNames(arrayOf("sarah","papai","Nashivai","JUliet","Shadya","Coni","Sindet")))
    println(sortEvenString("sarah"))
}
fun isEven(number:Int):Boolean{
    if (number%2==0){
        return true
    }
    else{
        return false
    }
}

data class Product(var name:String,var weight:Int,var price:Float,var categories:String) {
    fun check() {

        var grocery: MutableList<String> = mutableListOf<String>()
        var hygiene: MutableList<String> = mutableListOf<String>()
        var other: MutableList<String> = mutableListOf<String>()
        when (categories) {
            "groceries" -> grocery.add("${name}")
            "hygiene" -> hygiene.add("${name}")
            else -> other.add("${name}")
        }
        println(hygiene)
    }
}
fun  sortEvenString(str:String):String{
    var even=""
    for(i in str) {
    if (str.indexOf(i) % 2 == 0) {
        even += i
    }
}


    return even
}
fun sortNames(names:Array<String>):MutableList<String>{
    var sortedEven=mutableListOf<String>()

    names.forEach{ name->
        if (name.length%2==0){
            sortedEven.add(name)
        }
    }
    return sortedEven
}
