package journalClasses

class Group(val id: Int,
            val groupName: String,
            val studCount: Int,
            val marksAvg: Double
) {

    private val groupMutableList = mutableListOf<Group>()

    fun addGroup(groupInstance : Group) {
        groupMutableList.add(groupInstance)
    }

    fun removeGroup(groupId: Int) {

    }
}