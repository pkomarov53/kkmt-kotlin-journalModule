package data

class Journal {

    // списки хранящие группы, предметы, преподавателей и пары
    private val groupData = mutableListOf<Group>()
    private val subjectData = mutableListOf<Subject>()
    private val teacherData = mutableListOf<Teacher>()
    private val lessonData = mutableListOf<Lesson>()


    // добавить группу
    fun addGroup() {
        val id = groupData.size + 1

        print("Введите название группы -> ")
        val name = readln()

        print("Введите кол-во студентов в группе -> ")
        val studentCount = readln().toInt()

        print("Введите средний балл студентов -> ")
        val groupMark = readln().toDouble()

        val group = Group(id, name, studentCount, groupMark)
        println("\n$group\n")
        groupData.add(group)

    }

    // удалить группу
    fun removeGroup(id: Int) {
        if (groupData.isNotEmpty()) {
            groupData.forEach {
                if (it.groupId == id) {
                    groupData.remove(it)
                    println("Группа под id ${it.groupId} удален")
                    return
                }
            }
        } else {
            println("Список групп пуст")
            return
        }
    }

    // добавить предмет
    fun addSubject() {
        val id = subjectData.size + 1

        print("Введите название предмета -> ")
        val name = readln()

        print("Введите кол-во часов предмета -> ")
        val hours = readln().toInt()

        subjectData.add(Subject(id, name, hours))
    }

    // удалить предмет
    fun removeSubject(id: Int) {
        if (subjectData.isNotEmpty()) {
            subjectData.forEach {
                if (it.subjectId == id) {
                    subjectData.remove(it)
                    println("Предмет под id ${it.subjectId} удален")
                    return
                }
            }
        } else {
            println("Список предметов пуст")
            return
        }
    }

    // добавить учителя
    fun addTeacher() {
        val id = teacherData.size + 1

        print("Введите ФИО преподавателя -> ")
        val fullName = readln().split(" ")

        print("Введите опыт работы преподвателя -> ")
        val exp = readln().toInt()

        teacherData.add(Teacher(id, fullName[0], fullName[1], fullName[2], exp))
    }

    // удалить учителя
    fun removeTeacher(id: Int) {
        if (teacherData.isNotEmpty()) {
            teacherData.forEach {
                if (it.teacherId == id) teacherData.remove(it)
            }
        } else {
            println("Список преподавателей пуст")
            return
        }
    }

    // добавить пару
    fun addLesson() {
        val id = lessonData.size + 1
        var idChecker = false

        print("Введите id преподавателя -> ")
        val tId = readln().toInt()
        teacherData.forEach {
            if (it.teacherId == tId) {
                idChecker = true
                return@forEach
            }
        }
        require(idChecker) { "Преподавателя с таким id не существует"}

        print("Введите id группы -> ")
        val gId = readln().toInt()
        groupData.forEach {
            if (it.groupId == gId) {
                idChecker = true
                return@forEach
            }
        }
        require(idChecker) { "Группы с таким id не существует"}

        print("Введите id предмета -> ")
        val sId = readln().toInt()
        subjectData.forEach {
            if (it.subjectId == sId) {
                idChecker = true
                return@forEach
            }
        }
        require(idChecker) { "Предмета с таким id не существует"}

        print("Введите время начала пары -> ")
        val time = readln()

        print("Введите кабинет проведения пары -> ")
        val cabinet = readln().toInt()

        lessonData.add(Lesson(id, gId, sId, tId, time, cabinet))
    }

    // удалить пару
    fun removeLesson(id: Int) {
        if (lessonData.isNotEmpty()) {
            lessonData.forEach {
                if (it.lessonId == id) {
                    lessonData.remove(it)
                    println("Пара под id ${it.lessonId} удален")
                    return
                }
            }
        } else {
            println("Список предметов пуст")
            return
        }
    }
}