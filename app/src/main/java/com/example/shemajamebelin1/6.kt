//დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს String მონაცემს და დააბრუნებს პასუხს შეიცავს თუ არა ეს მონაცემი შემგედ სიმბოლოს ‘$’’
fun main(args: Array<String>) {
    println("enter i: ")
    var string = readLine()
    val character = '$'
    var f = 0

    if (string != null) {
        for (i in 0..string.length - 1) {
            if (character == string[i]) {
                ++f
            }
        }
    }
    println("string contains   $character = $f")
}

