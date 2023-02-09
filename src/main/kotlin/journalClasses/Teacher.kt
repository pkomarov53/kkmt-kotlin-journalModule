package journalClasses

class Teacher(val id: Int = 0,
              val surname: String = "Unknown",
              val name: String = "Unknown",
              val patronymic: String = "Unknown",
              val workExperience: Int = 0
) {

    private val teacherMutableList = mutableListOf<Teacher>()

    fun addTeacher(teacherInstance: Teacher) {
        teacherMutableList.add(teacherInstance)
    }

    fun removeTeacher(teacherId: Int) {

    }

    override fun toString(): String {
        return "Teacher ID -> $id\n" +
                "Surname -> $surname\n" +
                "Name -> $name\n" +
                "Patronymic -> $patronymic\n" +
                "Work Experience -> $workExperience"
    }
}