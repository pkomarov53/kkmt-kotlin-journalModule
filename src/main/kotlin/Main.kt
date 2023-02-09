import journalClasses.*
import kotlin.random.Random

fun main() {
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
                val groupManipulator = Group()
                println(message = "Please choose the action: add or del")
                when(readln()) {
                    "add" -> {
                        groupManipulator.addGroup(
                            Group(
                                Random.nextInt(1000, 10000),
                                readln(),
                                readln().toInt(),
                                readln().toDouble()
                            )
                        )
                        println(message = "object:\n" +
                                "${groupManipulator.groupMutableList.last()}")
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
                val subjectManipulator = Subject()
                println(message = "Please choose the action: add or del")
                when(readln()) {
                    "add" -> {
                        subjectManipulator.addSubject(
                            Subject(
                                Random.nextInt(1000, 10000),
                                readln(),
                                readln().toInt()
                            )
                        )
                        println(message = "object:\n" +
                                "${subjectManipulator.subjectMutableList.last()}")
                    }
                    "del" -> {
                        subjectManipulator.removeSubject(readln().toInt())
                    }
                    else -> {
                        println("Incorrect input")
                        continue
                    }
                }
            }

            "3" -> {
                val teacherManipulator = Teacher()
                println(message = "Please choose the action: add or del")
                when(readln()) {
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
                when(readln()) {
                    "add" -> {
                    }
                    "del" -> {
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