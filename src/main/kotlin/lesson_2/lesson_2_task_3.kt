fun main() {

    val startHours = 9
    val starMinute = 39
    val minuteOfRoads = 457

    val translationIntoMinutes = startHours * AGE_OF_MINUTE + starMinute
    val minutesOfArrival = translationIntoMinutes + minuteOfRoads
    val arrivalHours = minutesOfArrival / AGE_OF_MINUTE
    val arrivalMinutes = minutesOfArrival % AGE_OF_MINUTE

    println("$arrivalHours:$arrivalMinutes")
}
const val AGE_OF_MINUTE = 60