package data

class Subject(val subjectId: Int,
              private val subjectName: String,
              private val subjectHours: Int
) {
    override fun toString(): String {
        return "id предмета — ${this.subjectId}.\n" +
                "Название предмета — ${this.subjectName},\n" +
                "Кол-во учебных часов по предмету — ${this.subjectHours}.\n"
    }
}