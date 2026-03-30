fun main() {
    // functions with parameters
    // Parameters are inputs that get passed as arguments when invoking a 
    // function
    // Note: For parameters you must specify their data types.

    fun greeting (name : String) {
        println("Hello $name , Hope you had a good Day?")
    }

    // When the function is invoked, you pass a given name as an argument
    greeting("James")
    greeting("Benson")


    print("=====================")

      // below is an example of a function that is able to calculate the bmi of a person

    fun BMI( weight : Double, height : Double){
        val answer = weight / (height * height)

        println("The BMI of a person is: $answer")
    }

    BMI(69.6, 1.73)



}