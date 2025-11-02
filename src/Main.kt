class Student (val id:String,
               val name:String,
               val course:String,
               val mark: Double) {
    override fun toString(): String {
        return "Name: $name, Course: $course, Mark: $mark"
    }
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