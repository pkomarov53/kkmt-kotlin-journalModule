package journalClasses

class Teacher(private val id: Int = 0,
              private val surname: String = "Unknown",
              private val name: String = "Unknown",
              private val patronymic: String = "Unknown",
              private val workExperience: Int = 0
) {

    private val teacherMutableList = mutableListOf<Teacher>()

    fun addTeacher(teacherInstance: Teacher) {
        teacherMutableList.add(teacherInstance)
        teacherMutableList.forEach {
            println("$it")
        }
    }

    fun removeTeacher(teacherId: Int) {
        teacherMutableList.forEach {
            if (it.id == teacherId) {
                println("Found the id...")
                this.teacherMutableList.remove(it)
            } else {
                println("Incorrect id")
                return
            }
        }
    }

    fun get() {
        teacherMutableList.forEach {
            println("$it")
        }
    }

    override fun toString(): String {
        return "Teacher ID -> $id\n" +
                "Surname -> $surname\n" +
                "Name -> $name\n" +
                "Patronymic -> $patronymic\n" +
                "Work Experience -> $workExperience"
    }
}