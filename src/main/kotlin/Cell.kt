class Cell(val n: Int) {

    var state = 0
    var output = 0

    fun changeState(input: Int) {
        if (input > state) {
            state = n
            output = 1
        }
        else if (state != 0) {
            state--
            output = 0
        }
    }

}
