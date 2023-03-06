package data

class Lesson(val lessonId: Int,
             private val lessonTId: Int,
             private val lessonSId: Int,
             private val lessonGId: Int,
             private val lessonTime: String,
             private val lessonCabinet: Int
) {
    override fun toString(): String {
        return "id пары — ${this.lessonId},\n" +
                "id — ${this.lessonTId},\n" +
                "id — ${this.lessonGId},\n" +
                "id — ${this.lessonSId},\n" +
                "Время проведения пары — ${this.lessonTime},\n" +
                "Кабинет проведения пары — ${this.lessonCabinet}.\n"
    }
}