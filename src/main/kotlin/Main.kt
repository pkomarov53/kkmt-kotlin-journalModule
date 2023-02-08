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
        when(readln()) {
            "1" -> {
                println(message = "Please choose the action: add or del")
                when(readln()) {
                    "add" -> {
                        val obj = Group(Random.nextInt(1000, 10000),
                            readln(),
                            readln().toInt(),
                            readln().toDouble())
                    }
                    "del" -> {
                        print("Please enter ID of the group ->")

                    }
                    else -> {
                        println("Incorrect input")
                        continue
                    }
                }
            }
            "2" -> {
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
            "3" -> {
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