// LEAP YEARS
// USING IF STATEMENT
fun main() {
    val year = 2026
    if((year % 4 == 0 && year % 100 !=0)||(year % 400==0)){
        println("$year is a leap year")

    }else {
        println("$year is NOT a leap year")
    }
    
}
// Using when statements


// fun main() {
//      val year = 2024

//     when {
//         (year % 400 == 0) -> println("$year is a Leap Year")

//         (year % 100 == 0) -> println("$year is NOT a Leap Year")

//         (year % 4 == 0) -> println("$year is a Leap Year")

//         else->println("$year is NOT a leap year ")
       
    
// }
// }