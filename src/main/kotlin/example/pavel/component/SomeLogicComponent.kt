package example.pavel.component

import org.springframework.stereotype.Component

@Component
class SomeLogicComponent(
    val ageValidationComponent: AgeValidationComponent,
    val weightCalculatorComponent: WeightCalculatorComponent
) {

    fun isGood(age: Int, weight: Int) =
        ageValidationComponent.isAdult(age)
                && weightCalculatorComponent.isNormal(age, weight)


}