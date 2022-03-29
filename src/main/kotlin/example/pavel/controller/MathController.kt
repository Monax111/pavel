package example.pavel.controller


import example.pavel.model.Person
import example.pavel.repository.PersonDto
import example.pavel.repository.PersonRepository
import example.pavel.repository.mapToPersonDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class MathController(
    val personRepository: PersonRepository
) {

    @PostMapping("person")
    fun addPerson(@RequestBody person: Person): PersonDto {
        val personDto = personRepository.save(person.mapToPersonDto())
        return personDto
    }

    @GetMapping("person/all")
    fun allPerson() = personRepository.findAll()

    @GetMapping("person/id/{id}")
    fun getPersonById(@PathVariable id: Long) = personRepository.getById(id)

    @GetMapping("person/name/{name}")
    fun getPersonByName(@PathVariable name: String) = personRepository.findFirstByName(name)


}
