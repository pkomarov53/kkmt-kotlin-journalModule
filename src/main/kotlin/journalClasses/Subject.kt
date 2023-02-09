package journalClasses

class Subject(val id: Int = 0,
              val subjectName: String = "Unknown",
              val hoursCount: Int = 0
) {

    val subjectMutableList = mutableListOf<Subject>()

    fun addSubject(subjectInstance: Subject) {
        subjectMutableList.add(subjectInstance)
    }

    fun removeSubject(subjectId: Int) {

    }

    override fun toString(): String {
        return "Subject ID -> $id\n" +
                "Subject -> $subjectName\n" +
                "Subject hours -> $hoursCount"
    }
}