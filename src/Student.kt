class Student(
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

    fun getGrade(): String {
        return when (mark) {
            in 70.0..100.0 -> "First"
            in 60.0..69.9 -> "2/1"
            in 50.0..59.9 -> "2/2"
            in 40.0..49.9 -> "Third"
            else -> "Fail"
        }
    }
    //Metodo exercise 7
    fun didPass(): Boolean {
        return mark >= 40.0
    }

    override fun toString() = "Name: $name, Course: $course, Mark: $mark"
}
