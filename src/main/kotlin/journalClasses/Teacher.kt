package journalClasses

class Teacher(val id: Int,
              val surname: String,
              val name: String,
              val patronymic: String,
              val workExperience: Int
) {

    private val teacherMutableList = mutableListOf<Teacher>()

    fun addTeacher(teacherInstance: Teacher) {
        teacherMutableList.add(teacherInstance)
    }

    fun removeTeacher(teacherId: Int) {

    }
}