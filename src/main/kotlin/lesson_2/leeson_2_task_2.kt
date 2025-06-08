fun main() {

    val employees = 50
    val payOfEmployees = 30000
    val interns = 30
    val payOfInterns = 20000

    val employeeExpenses = employees * payOfEmployees
    val totalExpenses = employeeExpenses + (interns * payOfInterns)
    val averagePay = totalExpenses / 80

    println(employeeExpenses)
    println(totalExpenses)
    println(averagePay)
}