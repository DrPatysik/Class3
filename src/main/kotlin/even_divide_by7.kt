fun main() {
    var currentNumber: Int = 1

    while (currentNumber in 1..100)
    {

        if (currentNumber % 2 == 0)
        {
            if (currentNumber % 7 == 0)
            {
                println("Number is even and divide by 7 : $currentNumber")
                break
            }
        }

        currentNumber++

        }

}

