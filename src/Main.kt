fun main() {
    val undergrad = Undergraduate("1", "Alice", "CS")
    undergrad.mark = 75.0

    val masters = Masters("2", "Bob", "AI")
    masters.mark = 65.0

        // Mostramos los detalles
        println("Undergraduate Student: $undergrad, Grade: ${undergrad.getGrade()}, Passed: ${undergrad.didPass()}")
        println("Masters Student: $masters, Grade: ${masters.getGrade()}, Passed: ${masters.didPass()}")
        println("----------------------------------")
    }
