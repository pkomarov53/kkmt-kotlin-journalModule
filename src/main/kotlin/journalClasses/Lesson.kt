package journalClasses

class Lesson(private val id: Int = 0,
             private val teacherId: Int = 0,
             private val groupId: Int = 0,
             private val subjectId: Int = 0,
             private val subjectTime: String = ""
) {

    val lessonMutableList = mutableListOf<Lesson>()

    fun addLesson() {

    }

    fun deleteLesson() {

    }

    fun get() {

    }

}