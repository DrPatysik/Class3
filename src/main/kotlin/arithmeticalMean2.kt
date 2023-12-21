fun main() {
    var i = 5
    var counter = 0
    var sum = 0
    val end = 10

    while ( i <= end )
    {

        sum += i
        i++
        counter++
    }

    println( (sum / counter).toFloat() )

}