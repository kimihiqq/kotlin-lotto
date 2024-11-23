package stringcalculator.domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class StringCalculatorTest : StringSpec({
    "should return 0 when input is empty of null" {
        val stringCalculator = StringCalculator()
        stringCalculator.add(null) shouldBe 0
        stringCalculator.add("") shouldBe 0
    }
})
