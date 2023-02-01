import kotlin.math.ceil
fun main(args: Array<String>) {
    print("Enter the number of hours of parking:")
    val hours = readLine()!!.toDouble()
    var fee = 0.0
    if (hours <= 5) {
        fee = hours * 1
    } else if (hours <= 24) {
        fee = 5 * 1 + (hours - 5) * 0.5
    } else {
        fee = 5 * 1 + (24 - 5) * 0.5 + ceil((hours - 24) / 24) * 15
    }
    println("this is how much you have to pay: $fee")
}
