//დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს String მონაცემს და დააბრუნებს პასუხს არის თუ არა ეს მონაცემი პოლინდრომი
fun main(args: Array<String>) {
    var num = 727
    var revInt = 0
    var x: Int

    val Integer: Int = num
    while (num != 0) {
        x = num % 10
        revInt = revInt * 10 + x
        num /= 10
    }
    if (Integer == revInt)
        println("$Integer is a palindrome.")
    else
        println("$Integer is not a palindrome.")
}
