package ca.nick.nestedrecyclerviewfun.data

object TheRepository {

    private val _outerList = mutableListOf<List<Int>>()
    private val _innerList = mutableListOf<Int>()

    val data: List<List<Int>> get() = _outerList

    init {
        for (i in 1..100) {
            _innerList.add(i)
        }

        for (i in 1..25) {
            _outerList.add(_innerList.toList())
        }
    }
}