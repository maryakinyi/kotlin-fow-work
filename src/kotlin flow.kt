fun main(){
    number()
    println(they(arrayOf("Mary","John","Elizabeth","Kennedy","Sophia","Andrew")))
    serve(5)
    serve(14)
    serve(24)
    multiples()


}
fun number(){
    for (i in 1..100){
        if(i%2!=0){
            println(i)

        }
    }
}
fun they(names:Array<String>):Int{
    var total=0
    for(characters in names){
        if (characters.length>=5){
            total++
        }
    }
    return total
}
fun serve(age:Int){
    if (age<6){
        println( " serve milk")
    }
    else if(age >6 && age < 15) {
        println(" serve bottle of fanta orange")
    }
    else{
        println("serve a bottle CocaCola")
    }

}
fun multiples(){
    for (numbers in 1..100)
        if (numbers%3==0 && numbers%5!=0){
            println("fizz")
        }
        else if (numbers%5==0 && numbers%3!=0){
            println("buzz")
        }
        else if(numbers%3==0 && numbers%5==0){
            println("fizzbuzz")
        }
        else{
            println(numbers)
        }

}