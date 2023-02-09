import journalClasses.*
import kotlin.random.Random

fun main() {

    // Манипуляторы для работы с классами
    val groupManipulator = Group()
    val subjectManipulator = Subject()
    val teacherManipulator = Teacher()
    val lessonManipulator = Lesson()

    println("Program menu:\n" +
            "\t1. Add/delete group\n" +
            "\t2. Add/delete subject\n" +
            "\t3. Add/delete teacher\n" +
            "\t4. Add/delete lesson\n" +
            "\t5. Break program")

    while(true) {
        print(message = "\nUser input -> ")
        when(readln().lowercase()) {
            "1" -> {
                println(message = "Please choose the action: add or del")
                when(readln().lowercase()) {
                    "add" -> {
                        groupManipulator.addGroup(
                            Group(
                                Random.nextInt(1000, 10000),
                                readln(),
                                readln().toInt(),
                                readln().toDouble()
                            )
                        )
                    }
                    "del" -> {
                        print("Please enter ID of the group -> ")
                        groupManipulator.removeGroup(readln().toInt())
                    }
                    else -> {
                        println("Incorrect input")
                        continue
                    }
                }
            }

            "2" -> {

                println(message = "Please choose the action: add or del")
                when(readln().lowercase()) {
                    "add" -> {
                        subjectManipulator.addSubject(
                            Subject(
                                Random.nextInt(1000, 10000),
                                readln(),
                                readln().toInt()
                            )
                        )
                    }
                    "del" -> {
                        print("Please enter ID of the group -> ")
                        subjectManipulator.removeSubject(readln().toInt())
                    }
                    else -> {
                        println("Incorrect input")
                        continue
                    }
                }
            }

            "3" -> {
                println(message = "Please choose the action: add or del")
                when(readln().lowercase()) {
                    "add" -> {
                        teacherManipulator.addTeacher(
                            Teacher(
                                Random.nextInt(1000, 10000),
                                readln(),
                                readln(),
                                readln(),
                                readln().toInt()
                            )
                        )
                    }
                    "del" -> {
                        print("Please enter ID of the group -> ")
                        teacherManipulator.removeTeacher(readln().toInt())
                    }
                    else -> {
                        println("Incorrect input")
                        continue
                    }
                }
            }

            "4" -> {
                println(message = "Please choose the action: add or del")
                when(readln().lowercase()) {
                    "add" -> {
                    }
                    "del" -> {
                        print("Please enter ID of the lesson -> ")
                        lessonManipulator.removeLesson(readln().toInt())
                    }
                    else -> {
                        println("Incorrect input")
                        continue
                    }
                }
            }

            "5" -> {
                println("End of program...")
                break
            }

            else -> {
                println(message = "Incorrect input")
                continue
            }
        }
    }
}