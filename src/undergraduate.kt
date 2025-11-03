class Undergraduate(id: String, name: String, course: String) :
    Student(id, name, course) {

    override fun getGrade(): String {
        return when (mark) {
            in 70.0..100.0 -> "First"
            in 60.0..69.9 -> "2/1"
            in 50.0..59.9 -> "2/2"
            in 40.0..49.9 -> "Third"
            else -> "Fail"
        }
    }
}
