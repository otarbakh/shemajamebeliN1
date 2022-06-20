//დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს ორ მთელ რიცხვს და დააბრუნებს უსგ.
fun main(args: Array<String>) {
    var n1 = 4
    var n2 = 6


    while (n1 != n2) {
        if (n1 > n2)
            n1 -= n2
        else
            n2 -= n1
    }
    println("G.C.D = $n1")
}