// Using when statements
fun main() {
     val year = 2023

    when {
        (year % 400 == 0) -> println("$year is a Leap Year")

        (year % 100 == 0) -> println("$year is NOT a Leap Year")

        (year % 4 == 0) -> println("$year is a Leap Year")
        
        else->println("$year is NOT a leap year ")
       
    
}
}