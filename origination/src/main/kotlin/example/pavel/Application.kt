package example.pavel

import mu.KotlinLogging
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.system.measureTimeMillis

val iteration = 1000000

val logger = KotlinLogging.logger {}

fun main() {



    val mills = measureTimeMillis {

        repeat(800){
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply { logger.info { it.toString() } }
        }



    }
    println(mills)

}


val client = HttpClient.newBuilder().build()

val request = HttpRequest.newBuilder(URI("http://localhost:8080/pavel/time/$iteration")).GET().build()

fun executeRequest() = client.send(request, HttpResponse.BodyHandlers.ofString())


//10026
fun variant1(){

    val currency = 8
    val pool = Executors.newFixedThreadPool(currency)

    val mills = measureTimeMillis {
        repeat(100 * currency) {
            pool.submit {
                logger.info(executeRequest().toString())
            }

        }
        pool.awaitTermination(10, TimeUnit.SECONDS)
    }
    println(mills)
}