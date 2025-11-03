class Student(
    val id: String,
    val name: String,
    val course: String,
    initialMark: Double
) {
    var mark: Double = 0.0
        set(value) {
            if (value in 0.0..100.0) {
                field = value
            } else {
                println("Error: Invalid mark ($value). Must be 0..100.")
                // no cambia el field
            }
        }

    init {
        // 👇 Esto SÍ usa el setter y por tanto valida initialMark
        this.mark = initialMark
    }

    override fun toString() = "Name: $name, Course: $course, Mark: $mark"
}


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

        print("Enter mark: ")
        val markInput = readLine()!!.trim()
        val mark = markInput.toDoubleOrNull() ?: 0.0  // convierte a número o 0.0 si falla

        // Creamos un objeto Student
        val student = Student(id, name, course, mark)

        // Mostramos los detalles
        println("Student created: $student")
        println("----------------------------------")
    }
}