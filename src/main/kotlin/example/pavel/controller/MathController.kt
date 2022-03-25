package example.pavel.controller


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import kotlin.random.Random


@RestController
class MathController {

    @GetMapping("random")
    fun random(): Int = Random.nextInt()


}
