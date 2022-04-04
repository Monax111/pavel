package example.pavel.component

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class SomeLogicComponentTest {


    val ageValidationComponent  = mock(AgeValidationComponent::class.java)
    val weightCalculatorComponent  = mock(WeightCalculatorComponent::class.java)
    private val logic = SomeLogicComponent(ageValidationComponent, weightCalculatorComponent)

    @Test
    fun whenATrueAndBTrueThenTrue() {

        `when`(ageValidationComponent.isAdult(33)).thenReturn(true)

        `when`(weightCalculatorComponent.isNormal(33, 140)).thenReturn(true)

        logic.isGood(33, 140) shouldBe true

    }



}