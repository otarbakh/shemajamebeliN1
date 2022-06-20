import java.util.*
//აწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს მთელ რიცხვს და დააბრუნებს ამ რიცხვის შებრუნებულს. მაგალითად შემოვიდა 10220 უნდა დაბრუნდეს 220
fun main() {
    val read = Scanner(System.`in`)
    println("Enter Num:")
    var num = read.nextInt()
    var revNum = 0
    while (num != 0) {
        val remainder = num % 10
        revNum = revNum * 10 + remainder
        num /= 10
    }

    println("Reversed Num = $revNum")
}