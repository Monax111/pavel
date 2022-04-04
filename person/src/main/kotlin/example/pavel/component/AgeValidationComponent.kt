package example.pavel.component

import org.springframework.stereotype.Component

@Component
class AgeValidationComponent {

    fun isAdult(age: Int) = age >= 50

}