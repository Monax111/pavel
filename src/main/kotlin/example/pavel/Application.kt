package example.pavel

import com.google.gson.Gson
import example.pavel.model.Education
import example.pavel.model.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.json.GsonJsonParser
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext


@SpringBootApplication
class Application

fun main(args: Array<String>) {

    val person = Person(
        name = "123",
        age = 2,
        tel = "213213",
        mail = "213",
        education = Education.Basic,
        address = mapOf(),
        car = listOf()
    )
    val personAsText = Gson().toJson(person)
    println(personAsText)
    runApplication<Application>(*args)
}

