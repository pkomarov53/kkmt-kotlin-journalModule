package journalClasses

import java.io.File

class Lesson(private val id: Int = 0,
             private val teacherId: Int = 0,
             private val groupId: Int = 0,
             private val subjectId: Int = 0,
             private val subjectTime: String = "",
             private val lessonCabinet: Int = 0
) {

    private val lessonMutableList = mutableListOf<Lesson>()

    fun addLesson(idList: List<Int>, lessonTime: String, lessonCabinet: Int) {
        val fileWriter = File("output.txt")
        val fileText = "${idList.toString()}"
    }

    fun removeLesson(lessonId: Int) {
        lessonMutableList.forEach {
            if (it.id == lessonId) {
                println("Found the id")
                lessonMutableList.remove(it)
            } else {
                println("Incorrect id")
                return
            }
        }
    }

    fun get() {

    }

    override fun toString(): String {
        return "Lesson id -> $id\n" +
                "Teacher id -> $teacherId\n" +
                "Group id -> $groupId\n" +
                "Subject id -> $subjectId\n" +
                "Time -> $subjectTime\n" +
                "Cabinet -> $lessonCabinet"
    }
}