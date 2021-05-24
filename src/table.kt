fun main() {
    multiply()

}
fun multiply(){
    println("Enter number:")
    var number= Integer.valueOf(readLine())
   for (i in 1..10)
        if (i<=10){
            var product= i*number
            println("$i*$number= $product")
        }
    }
