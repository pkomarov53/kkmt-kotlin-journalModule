package data

class Group(val groupId: Int,
            private val groupName: String,
            private val groupStudCount: Int,
            private val groupAvgMark: Double
) {
    override fun toString(): String {
        return "id группы — ${this.groupId},\n" +
                "Название группы — ${this.groupName},\n" +
                "Кол-во студентов в группе — ${this.groupStudCount},\n" +
                "Средний балл студентов группы — ${this.groupAvgMark}.\n"
    }
}