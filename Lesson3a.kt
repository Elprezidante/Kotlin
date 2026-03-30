fun main() {

    // For loop 
    // It is used to execute a block of code/statement a number of times untill a condition is met
     for (number in 1..10) {
        println ("The count is $number")
        
     }
     println("=====================")

    //  create a for loop that can print from 50-69
    for (number in 50..69){
        println("The count is $number")
    // Check on the difference between local variables and global variables


    }
    println("==============================")
    // for (i in start..end step number) {
    // code }

    for (i in 1..10 step 2) {
        println(i)
    }
    println("==========================")
    for(i in 20..40 step 2){
        
        println(i)
    }

println("==================")
 for(i in 20..40 ){
    if ( i % 2 !=0){
        println(i)
    }
        
        println(i)
    }
    println("===================")
    for(m in 1..5){
        val multiple = m * 5
        println("5 * $m=$multiple")

        }
println("===================")
//create a program that is able to find the factorial of number 5
val number = 5
var factorial = 1
for(m in 1..number){
    factorial *= m

}
println("factorial of $number is $factorial")
    }

    

