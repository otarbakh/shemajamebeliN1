//აწერეთ რეკურსიული ფუნქცია რომელიც დაითვლის 100-მდე ყველა ლუწი
//რიცხვების ჯამს
fun main(args: Array<String>) {
    val num = 100
    val sum = addNum(num)
    println("Summary = $sum")
}
fun addNum(num: Int): Int {
    return if (num != 0)
        num/2 + addNum(num - 1)
    else
        num
}