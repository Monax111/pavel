package example.pavel

import com.google.gson.Gson
import example.pavel.model.Education
import example.pavel.model.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.json.GsonJsonParser
import org.springframework.boot.runApplication


@SpringBootApplication
class Application

fun main(args: Array<String>) {

    runApplication<Application>(*args)
}
