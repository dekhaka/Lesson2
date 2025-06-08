import kotlin.math.pow

fun main() {

    val deposit: Double = 70000.0
    val rate: Double = 16.7 / 100
    val years: Int = 20

    val finalPay = deposit * (1 + rate).pow(years)

    println(String.format("%.3f", finalPay))

}