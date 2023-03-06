package data

class Teacher(val teacherId: Int,
              private val teacherSurname: String,
              private val teacherName: String,
              private val teacherPatronymic: String,
              private val teacherExperience: Int
) {
    override fun toString(): String {
        return "id преподавателя — ${this.teacherId},\n" +
                "ФИО преподавателя — ${this.teacherSurname} ${this.teacherName}, ${this.teacherPatronymic},\n" +
                "Опыт работы преподавателя — ${this.teacherExperience}.\n"
    }
}