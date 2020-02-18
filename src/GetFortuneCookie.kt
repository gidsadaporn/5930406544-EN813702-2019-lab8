import java.util.*

fun main() {
    print(getFortuneCookie())
}

fun getFortuneCookie(): String {
    print("Enter your birthday: ")
    var birthday = readLine()?.toIntOrNull() ?: return ("Please enter your birthday")
    val st = listOf(
        "You will have a great day!",
        "Things well go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    return("Your fortune is:  " + st[birthday % st.size]).toString()
}

