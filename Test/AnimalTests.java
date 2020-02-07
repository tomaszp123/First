/**
 * AnimalTests
 */
package com.example.project;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;

public class AnimalTests {
    @Test
    @DisplayName("Voice of Animal")
    void AnimalVoice(){
        Dog rex = new Dog();


    }
    

    
}
/*

package com.example.project;



public class Calculator {



	public int add(int a, int b) {

		return a + b;

	}



}

class CalculatorTests {



	@Test

	@DisplayName("1 + 1 = 2")

	void addsTwoNumbers() {

		Calculator calculator = new Calculator();

		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");

	}



	@ParameterizedTest(name = "{0} + {1} = {2}")

	@CsvSource({

			"0,    1,   1",

			"1,    2,   3",

			"49,  51, 100",

			"1,  100, 101"

	})

	void add(int first, int second, int expectedResult) {

		Calculator calculator = new Calculator();

		assertEquals(expectedResult, calculator.add(first, second),

				() -> first + " + " + second + " should equal " + expectedResult);

	}

}
*/