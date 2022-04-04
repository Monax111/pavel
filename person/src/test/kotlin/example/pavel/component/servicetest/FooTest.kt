package example.pavel.component.servicetest

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class FooTest {

    val client = HttpClient.newBuilder().build()

    @Test
    fun checkController() {
        val request = HttpRequest
            .newBuilder()
            .uri(URI("http://localhost:8080/pavel/person/other/44/150"))
            .GET()
            .build()

        println( client.send<String>(request, HttpResponse.BodyHandlers.ofString()))
    }

}