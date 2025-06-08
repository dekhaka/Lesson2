fun main() {

    val startHours = 9
    val starMinute = 39
    val minuteOfRoads = 457

    val translationIntoMinutes = startHours * 60 + starMinute
    val minutesOfArrival = translationIntoMinutes + minuteOfRoads
    val arrivalHours = minutesOfArrival / 60
    val arrivalMinutes = minutesOfArrival % 60

    println("$arrivalHours:$arrivalMinutes")
}