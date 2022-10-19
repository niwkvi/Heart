fun main() {

    println("\nWelcome to our heart :)")
    println("\nInput n (max state):")
    val n = readln().toInt()
    val cn = CellNetwork(n)

    cn.addCell(listOf())
    cn.addCell(listOf(0))
    cn.addCell(listOf(1))
    cn.addCell(listOf(2))
    cn.addCell(listOf(3))



    while (true) {
        println("\nInput the signal:")
        val input = readln()
        val signal = if (input.isNotEmpty()) input.split(' ').map { it.toInt() }
                     else List(cn.id) {0}
        cn.nextTick(signal)
        for (i in cn.listOfCells) {
            print("${i.state} ")
        }
        println()
    }

}
