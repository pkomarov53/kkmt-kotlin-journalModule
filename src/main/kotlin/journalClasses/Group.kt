package journalClasses

class Group(private val id: Int = 0,
            private val groupName: String = "Unknown",
            private val studCount: Int = 0,
            private val marksAvg: Double = 0.0
) {

    val groupMutableList = mutableListOf<Group>()

    fun addGroup(groupInstance : Group) {
        groupMutableList.add(groupInstance)
    }

    fun removeGroup(groupId: Int) {
        print(1)
        groupMutableList.forEach {
            if (it.id == groupId) {
                println("Found the id!")
                groupMutableList.remove(it)
            }
            else {
                println("Incorrect ID")
                return
            }
        }
    }

    override fun toString(): String {
        return "Group id -> $id\n" +
                "Name of the group -> $groupName\n" +
                "Student count -> $studCount\n" +
                "GPA -> $marksAvg"
    }
}