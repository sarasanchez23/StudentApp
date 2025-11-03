abstract class Student(
    val id: String,
    val name: String,
    val course: String
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

   abstract fun getGrade(): String //Se implementara en las subclases

    fun didPass(): Boolean {
        return mark >= 40.0
    }

    override fun toString() = "Name: $name, Course: $course, Mark: $mark"
}
