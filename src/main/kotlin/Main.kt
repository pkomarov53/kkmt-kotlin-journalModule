import data.Journal
import kotlin.system.exitProcess


fun main() {
    val journal = Journal()
    println("Меню программы:" +
            "\n\t1. Добавить/удалить группу" +
            "\n\t2. Добавить/удалить предмет" +
            "\n\t3. Добавить/удалить преподавателя" +
            "\n\t4. Добавить/удалить пару" +
            "\n\t5. Завершить работу программы")
    while(true) {
        print("Введите команду от 1 до 5 -> ")
        when (readln()) {
            "1" -> {
                print("Для добавления группы введите \"add\", а для удаления \"del\" -> ")
                when (readln()) {
                    "add" -> {
                        journal.addGroup()
                    }
                    "del" -> {
                        print("Введите id группы -> ")
                        journal.removeGroup(readln().toInt())
                    }
                }
            }

            "2" -> {
                print("Для добавления предмета введите \"add\", а для удаления \"del\" -> ")
                when (readln()) {
                    "add" -> {
                        journal.addSubject()
                    }
                    "del" -> {
                        print("Введите id предмета -> ")
                        journal.removeSubject(readln().toInt())
                    }
                }
            }

            "3" -> {
                print("Для добавления преподавателя введите \"add\", а для удаления \"del\" -> ")
                when (readln()) {
                    "add" -> {
                        journal.addTeacher()
                    }
                    "del" -> {
                        print("Введите id учителя -> ")
                        journal.removeTeacher(readln().toInt())
                    }
                }

            }

            "4" -> {
                print("Для добавления пары введите \"add\", а для удаления \"del\" -> ")
                when (readln()) {
                    "add" -> {
                        journal.addLesson()
                    }
                    "del" -> {
                        print("Введите id пары -> ")
                        journal.removeLesson(readln().toInt())
                    }
                }
            }
            
            "5" -> exitProcess(0)
        }
    }
}