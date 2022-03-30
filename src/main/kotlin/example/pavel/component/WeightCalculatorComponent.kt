package example.pavel.component

import org.springframework.stereotype.Component

@Component
class WeightCalculatorComponent {

    fun isNormal(age: Int, weight: Int) = weight - age > 100

}