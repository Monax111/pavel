package example.pavel.controller


import example.pavel.component.SomeLogicComponent
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
    val personRepository: PersonRepository,
    val someLogicComponent: SomeLogicComponent
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

    @GetMapping("person/other/{age}/{weight}")
    fun doSome(@PathVariable age:Int, @PathVariable weight:Int) = someLogicComponent.isGood(age, weight)


}
