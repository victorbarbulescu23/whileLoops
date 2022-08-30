fun main() {
    var counter = 0
    var userResponse = 0

    //While loops are used more frequently
    while (counter < 10){
        //println("This first counter is at: $counter")
        counter++
    }

    counter = 10
    println()

    //Do-while loops execute the commands BEFORE the while loop's condition
    // is checked, so even if the value of counter is false, the program will still execute once
    do {
       //println("This second counter is at: $counter")
        counter++
    } while (counter < 10)

    //Adding a menu to direct the user

    do {
        println("1) First Choice")
        println("2) Second Choice")
        println("3) Third Choice")
        println("9) Exit")

        print("Enter Choice: ")
        userResponse = readLine()!!.toInt()
    }while (userResponse != 9)

}