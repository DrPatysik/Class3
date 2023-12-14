fun main() {
    var number = 1000
    while ( number in 1 ..1000 )
    {
        if( number % 2 == 0 )
        {
            println( "$number" )
        }
        number--

    }
}