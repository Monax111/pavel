package example.pavel.controller


import example.pavel.model.Person
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import kotlin.random.Random


@RestController
class MathController {

    private val personStorage: MutableList<Person> = mutableListOf()

    @PostMapping("person")
    fun addPerson(@RequestBody person: Person): Person {
        personStorage.add(person)
        return person
    }

    @GetMapping("person/all")
    fun allPerson() = personStorage

    @GetMapping("person/random")
    fun randomPerson() = personStorage[Random.nextInt(0,personStorage.size)]



}
