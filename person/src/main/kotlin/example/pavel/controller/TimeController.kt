package example.pavel.controller


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime


@RestController
class TimeController {

    @GetMapping("time/{iteration}")
    fun doSome(@PathVariable iteration: Int): String {

        var testString = LocalDateTime.now().toString()
        repeat(iteration){
            testString = testString.hashCode().toString()
            //Thread.sleep(10)
        }
        return testString
    }


}
