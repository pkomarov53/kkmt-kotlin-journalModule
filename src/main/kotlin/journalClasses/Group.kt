package journalClasses

class Group(private val id: Int = 0,
            private val groupName: String = "Unknown",
            private val studCount: Int = 0,
            private val marksAvg: Double = 0.0
) {

    private val groupMutableList = mutableListOf<Group>()

    fun addGroup(groupInstance: Group) {
        groupMutableList.add(groupInstance)
    }

    fun removeGroup(groupId: Int) {
        groupMutableList.forEach {
            if (it.id == groupId) {
                println("Found the id!")
                this.groupMutableList.remove(it)
            } else {
                println("Incorrect id")
                return
            }
        }
    }

    fun get() {
        groupMutableList.forEach {
            println("$it")
        }
    }

    override fun toString(): String {
        return "Group id -> $id\n" +
                "Name of the group -> $groupName\n" +
                "Student count -> $studCount\n" +
                "GPA -> $marksAvg\n"
    }
}