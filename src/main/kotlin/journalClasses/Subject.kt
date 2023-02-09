package journalClasses

class Subject(private val id: Int = 0,
              private val subjectName: String = "Unknown",
              private val hoursCount: Int = 0
) {

    private val subjectMutableList = mutableListOf<Subject>()

    fun addSubject(subjectInstance: Subject) {
        subjectMutableList.add(subjectInstance)
    }

    fun removeSubject(subjectId: Int) {
        subjectMutableList.forEach {
            if (it.id == subjectId) {
                println("Found the id")
                subjectMutableList.remove(it)
            } else {
                println("Incorrect id")
                return
            }
        }
    }

    fun get() {
        subjectMutableList.forEach {
            println("$it")
        }
    }
    override fun toString(): String {
        return "Subject ID -> $id\n" +
                "Subject -> $subjectName\n" +
                "Subject hours -> $hoursCount"
    }
}