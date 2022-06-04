@file : JvmName( "guess_the_num" )

import kotlin.random.Random

fun main() {
    print( "Would you like to guess or let computer guess what you thought\nType me for user or anything else for computer : " )
    if ( readln() == "me" ) user() else computer()
}

fun user() {
    val randomNum = Random.nextInt( 1000 ) + 1
    println( "The no is in between 1 to 1000")
    var user_input = -1
    var tries = 0
    while ( user_input != randomNum ) {
	tries++
        print(":: ")
        user_input = readln().toInt()
	if ( user_input < randomNum ) println( ":: Guess a greater num" )
	else if ( user_input > randomNum ) println( ":: Guess a smaller num" )
    }
    println( ":: You Guess The Write Num in $tries tries" )
}

fun computer() {
    var start = 1 ;
    print( ":: Guessed num is under which number : " )
    var end = readln().toInt()
    println( "::     Instruction\n:: If number is smaller type \'<\'\n:: If num is greater type \'>\'\n:: If number is correct type \'=\'" )
    var tries = 0
    var num : Int
    var userInput : String
    while ( true ) {
	num = Random.nextInt( start , end )
	tries++
	print( ":: " )
	print( ":: Is $num the number in your mind : ")
	userInput = readln()
	if ( userInput == "=" ) {
	    println( if ( tries > 10 ) ":: That was a tough num to guess it took me $tries tries to guess the num" else ":: Yoohoo i won" )
	    break
	} else if ( userInput == "<" ) start = num +1
	else end = num -1
    }
}
