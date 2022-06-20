//დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს ორ მთელ რიცხვს და დააბრუნებს უსგ.
fun main(args: Array<String>) {
    val n1 = 10
    val n2 = 15
    var lcm: Int = if (n1 > n2) n1 else n2
    while (true) {
        if (lcm % n1 == 0 && lcm % n2 == 0) {
            println("The LCM of $n1 and $n2 is $lcm.")
            break
        }
        ++lcm
    }
}