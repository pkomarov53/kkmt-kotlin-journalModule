package journalClasses

import java.io.File
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


private val dtf = DateTimeFormatter.ofPattern("HH:mm")

class Lesson(private val id: Int = 0,
             private val teacherId: Int = 0,
             private val groupId: Int = 0,
             private val subjectId: Int = 0,
             private var subjectTime: Any = LocalDateTime.now().format(dtf),
             private val lessonCabinet: Int = 0
) {
    private val lessonMutableList = mutableListOf<Lesson>()

    fun addLesson(lessonInstance: Lesson) {
        lessonMutableList.add(lessonInstance)
        val fileWriter = File("$id.txt")
        fileWriter.appendText(lessonInstance.toString())
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
        lessonMutableList.forEach {
            println("$it")
        }
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