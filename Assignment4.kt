// Create a function that accepts parameter that is able to do the convertion of degree celcius into farenhe... 
fun convert(celsius: Double) {
    val fahrenheit = (celsius * 1.8) + 32
    println("$celsius°C is $fahrenheit°F")
}

// Create a function that is able to calculate the compound interest of a person.
fun interest(principal: Double, rate: Double, years: Int) {
    var amount = principal
    // A simple way to do it: multiply the amount for every year
    for (i in 1..years) {
        amount = amount * (1 + rate / 100)
    }
    println("After $years years, the total amount is: $amount")
}

// Research on inherintance in kotlin. Come up with an example of a program
// 'open' means this class is "unlocked" so other classes can use it
open class Phone {
    fun makeCall() {
        println("Calling...")
    }
}

// Smartphone inherits (gets) the 'makeCall' ability from Phone
class SmartPhone : Phone() {
    fun browseInternet() {
        println("Browsing the web...")
    }
}

fun main() {
    // 1. Temperature
    convert(25.0)

    println("=======================")

    // 2. Interest (1000 dollars, 5% interest, for 3 years)
    interest(1000.0, 5.0, 3)

    println("=======================")

    // 3. Inheritance
    val myPhone = SmartPhone()
    myPhone.makeCall()        // This comes from the parent (Phone)
    myPhone.browseInternet()  // This is its own special feature
}