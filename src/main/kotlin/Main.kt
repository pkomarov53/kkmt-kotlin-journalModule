import journalClasses.*
import java.time.LocalTime
import kotlin.random.Random

fun main() {
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

    var flag = false
    while(true) {
        print(message = "\nUser input -> ")
        when(readln().lowercase()) {
            "1" -> {
                println(message = "Please choose the action: add or del")
                when(readln().lowercase()) {
                    "add" -> {
                        groupManipulator.addGroup(
                            Group(
                                Random.nextInt(1000, 2000),
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
                                Random.nextInt(2000, 3000),
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
                                Random.nextInt(3000, 4000),
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
                        val gId = readln().toInt()
                        groupManipulator.groupMutableList.forEach {
                            flag = it.id == gId
                        }
                        val tId = readln().toInt()
                        groupManipulator.groupMutableList.forEach {
                            flag = it.id == tId
                        }
                        val sId = readln().toInt()
                        groupManipulator.groupMutableList.forEach {
                            flag = it.id == sId
                        }
                        if (flag) {
                            lessonManipulator.addLesson(
                                Lesson(
                                    Random.nextInt(4000, 5000),
                                    tId,
                                    gId,
                                    sId,
                                    readln(),
                                    readln().toInt()
                                )
                            )
                        } else println("There was an error while parsing the id")
                        lessonManipulator.get()
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