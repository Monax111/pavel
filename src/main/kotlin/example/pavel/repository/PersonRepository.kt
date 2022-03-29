package example.pavel.repository

import example.pavel.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import kotlin.random.Random


fun Person.mapToPersonDto() = PersonDto(
    name = name,
    age = age,
    mail = mail,
    tel = tel,
    education = education.toString(),
    address = "",
    car = ""
)

@Entity
@Table(name = "person")
class PersonDto(
    @Id
    var id: Long = Random.nextLong(),
    val name: String,
    val age: Int,
    val car: String,
    val education: String,
    val mail: String,
    val address: String,
    val tel: String
)

interface PersonRepository : JpaRepository<PersonDto, Long> {

    fun findFirstByName(name: String): PersonDto


}