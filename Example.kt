fun main(args: Array<String>) {
    // how to print nairobi and kisumu on the same line
     val counties = arrayOf("Nairobi", "Mombasa", "Kisumu", "Nakuru", "Eldoret", "Machakos", "Kiambu")
    
    for (county in counties) {
        if(county =="Nairobi" || county == "Kisumu"){
            print(" $county")

        }
    
       
    }
}