package example.pavel.model

class Person(
    val name: String,
    val age: Int,
    val car: List<Car>,
    val education: Education,
    val mail: String,
    val address: Map<String, String>,
    val tel: String
)

class Car(
    val type: String,
    val number: String
)

enum class Education { Basic, Middle, Magister }

