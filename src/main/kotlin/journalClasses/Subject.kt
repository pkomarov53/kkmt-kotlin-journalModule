package journalClasses

class Subject(val id: Int,
              val subjectName: String,
              val hoursCount: Int
) {

    private val subjectMutableList = mutableListOf<Subject>()

    fun addSubject(subjectInstance: Subject) {
        subjectMutableList.add(subjectInstance)
    }

    fun removeSubject(subjectId: Int) {

    }
}