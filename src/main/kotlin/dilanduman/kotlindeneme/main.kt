package dilanduman.kotlindeneme

fun main() {
    println("Hello World!")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // find double of sum of even numbers
    // çift sayıların toplamının 2 katını bulun
    // even, sum, double

    var total = 0
    for (number in numbers) {
        if (number % 2 == 0) total += number
    }
    println(total * 2)
}