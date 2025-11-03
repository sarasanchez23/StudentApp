fun main() {
    while (true) {
        print("Enter student name (or type 'quit' to stop): ")
        val name = readLine()!!.trim()

        // Si el usuario escribe "quit", salimos del bucle
        if (name.equals("quit", ignoreCase = true)) {
            println("Exiting program...")
            break
        }

        // Pedimos el resto de los datos
        print("Enter student ID: ")
        val id = readLine()!!.trim()

        print("Enter course: ")
        val course = readLine()!!.trim()

        // Creamos un objeto Student sin el mark
        val student = Student(id, name, course)

        //ahora pedimos el mark y usamos el setter
        print("Enter mark: ")
        val markInput = readLine()!!.trim()
        val markValue = markInput.toDoubleOrNull() ?: 0.0
        student.mark = markValue  // usa el setter que valida

        // Mostramos los detalles
        println("Student created: $student, Grade: ${student.getGrade()}\n")
        println("Passed: ${student.didPass()}")
        println("----------------------------------")
    }
}