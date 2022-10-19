import kotlin.math.max

class CellNetwork(val n: Int) {

    var id = 0
    private val listOfNeighbors = mutableListOf<MutableList<Int>>()
    val listOfCells = mutableListOf<Cell>()

    fun addCell(neighbors: List<Int>) {
        listOfNeighbors.add(neighbors.toMutableList())
        listOfCells.add(Cell(n))
        for (i in neighbors)
            listOfNeighbors[i].add(id)
        id++
    }

    fun nextTick(signals: List<Int>) {
        val maxSignals = List(id) {
            max(signals[it], listOfNeighbors[it].maxOf { T -> listOfCells[T].output })
        }
        for ((cellIndex, cell) in listOfCells.withIndex()) {
            cell.changeState(maxSignals[cellIndex])
        }
    }

}
