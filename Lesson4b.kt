// below is a function that is able to add two numbers
fun addition() {
    val number1 = 10
    val number2 = 20
    val sum = number1 + number2
    println("The sum of the two numbers is :$sum")
}

// create a function that is able to multiply 3 numbers below
fun multiply(a: Int, b: Int, c: Int): Int {
    return a * b * c
}

// given two numbers, create a function that is able to find the largest and smallest of the numbers
fun findMinMax(a: Int, b: Int): Pair<Int, Int> {
    val min = if (a < b) a else b
    val max = if (a > b) a else b
    return Pair(min, max)
}

// This is your single main function that runs everything
fun main() {
    // 1. Calling the addition function
    addition()

    // 2. The separator line (moved inside main so it can execute)
    println("=======================")

    // 3. Logic for multiplying numbers
    val result = multiply(2, 3, 4)
    println("Result: $result")
    
    println("=======================")

    // 4. Logic for finding Min and Max
    val (min, max) = findMinMax(10, 25)
    println("Smallest: $min")
    println("Largest: $max")
}