
fun PrintPatientInfo(name:Char,age:Int,iSdiabetic:Boolean){
   println("Your name is $name")
    println("Your age is $age")
    println("Have diabetic is $iSdiabetic")
}



fun main(args: Array<String>) {
    println("Please Enter your name")
    var name= readLine()!!.get(0)
    println("Please Enter your age")
    var age = readLine()!!.toInt()
    println("Do you have diabetes Please only write true/false")
    var isDiabetic =readLine()!!.toBoolean()
    println("We will show your information Please write true if it is Correct")
    PrintPatientInfo(name,age,isDiabetic)
    var isCorrect = readLine()!!.toBoolean()
    println("Thank you!")

}