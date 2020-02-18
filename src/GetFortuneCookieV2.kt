import java.util.*;

fun main(){
    var fortune: String
    for(i in 1..10){
        fortune = getFortune(getBirthday())
        print("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy and enjoy life!")) break;
    }
}

fun getFortune(birthday: Int?): String{
    val fortunes = listOf ( "You will have a great day!" ,
                            "Things will go well for you today.",
                            "Enjoy a wonderful day of success.",
                            "Be humble and all will turn out wll.",
                            "Today is a good day for exercising restraint.",
                            "Take it easy and enjoy life!",
                            "Treasure your friends because they are your greatest fortune.")
    return when(birthday){
        in -10000..0 -> "Please Enter a valid birthday (1-31).\n"
        in 32..10000 -> "Please Enter a valid birthday (1-31).\n"
        in 1..7 -> "Have a good start the first week of month.\n"
        in 28..31 -> "Enjoy that last days of month.\n"
        null ->"Please Enter a valid birthday (1-31).\n"
        else -> fortunes[birthday!! % fortunes.size ]+ "\n"
    }
}

fun getBirthday(): Int?{
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull()?:return null
}

