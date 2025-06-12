fun main() {

    val minedCrystals = 7
    val minedFerum = 11
    val depositTime = 20
    val fullPercentage = 100

    val bonusCrystals = (minedCrystals * depositTime) / fullPercentage
    val bonusFerum = (minedFerum * depositTime) / fullPercentage

    println("Кристалическая руда: $bonusCrystals")
    println("Железная руда: $bonusFerum")

}