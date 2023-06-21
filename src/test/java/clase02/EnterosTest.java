package clase02;

import static clase02.Enteros.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class EnterosTest {

    @Test
    public void givenPositiveInteger_whenCheckIsPositive_thenTrue() {
        // Given
        int value = 5;

        // When
        boolean actual = esPositivo(value);

        // Then
        assertTrue(actual, "The method did not identify the positive number correctly");
    }

    @Test
    public void givenTwoIntegers_whenSum_thenCorrectResult() {
        // Given
        int value1 = 7;
        int value2 = 3;
        int expected = 10;

        // When
        int actual = suma(value1, value2);

        // Then
        assertEquals(expected, actual, "The method did not calculate the sum correctly");
    }

    @Test
    public void givenTwoEqualIntegers_whenCheckIsEqual_thenTrue() {
        // Given
        int value1 = 4;
        int value2 = 4;

        // When
        boolean actual = esIgual(value1, value2);

        // Then
        assertTrue(actual, "The method did not identify the numbers as equal correctly");
    }


/*
* Ejercicio 2: Completar los test unitarios
*
* */


    @Test
    // Prueba para el método esNegativo(). Se espera que esta prueba verifique si un número es negativo correctamente.
    public void givenNegativeInteger_whenCheckIsNegative_thenTrue() {
        // Given
        int value = -10;
        // When
        boolean actual = esNegativo(value);
        // Then
        assertTrue(actual);
    }

    @Test
    // Prueba para el método esCero(). Se espera que esta prueba verifique si un número es cero correctamente.
    public void givenZero_whenCheckIsZero_thenTrue() {
        // Given
        int value = 0;
        //when
       boolean actual = esCero(value);
        // Then
      assertTrue(actual);
    }

    @Test
    // Prueba para el método resta(). Se espera que esta prueba calcule la resta de dos números correctamente.
    public void givenTwoIntegers_whenSubtract_thenCorrectResult() {
        // Given
        int value1 = 5;
        int value2 = 5;
        int expected = 0;

        //When
        int actual = resta(value1, value2);

        //Then
        assertEquals(expected, actual
        );
    }

    @Test
    // Prueba para el método multiplicacion(). Se espera que esta prueba calcule la multiplicación de dos números correctamente.
    public void givenTwoIntegers_whenMultiply_thenCorrectResult() {
        // Given
        int value1 =5;
        int value2 = 8;
        int expected = 40;

        //When
        int actual = multiplicacion(value1, value2);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    // Prueba para el método division(). Se espera que esta prueba calcule la división de dos números correctamente y maneje correctamente el caso de división por cero.
    public void givenTwoIntegers_whenDivide_thenCorrectResult() {
        // Given
        int value1 = 10;
        int value2 = 2;
        int expected = 5;

        //When
        float actual = division(value1, value2);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    // Prueba para el método esMayor(). Se espera que esta prueba verifique correctamente si un número es mayor que otro.
    public void givenTwoIntegers_whenCheckIsGreater_thenCorrectResult() {
        // Given
        int value1 = 5;
        int value2 = 3;

        //When
        boolean actual = esMayor(value1, value2);

        //Then
        assertTrue(actual);
    }

    @Test
    // Prueba para el método esMenor(). Se espera que esta prueba verifique correctamente si un número es menor que otro.
    public void givenTwoIntegers_whenCheckIsLess_thenCorrectResult() {
        // Given
        int value1 = 4;
        int value2 = 10;

        //When
        boolean actual = esMenor(value1, value2);

        //Then
        assertTrue(actual);
    }

    @Test
    // Prueba para el método modulo(). Se espera que esta prueba calcule correctamente el módulo (resto de la división) de dos números y maneje correctamente el caso de división por cero.
    public void givenTwoIntegers_whenCalculateModulus_thenCorrectResult() {
        // Given
        int value1 = 5;
        int value2 = 2;
        int expected = 1;

        //When
        int actual =modulo(value1, value2);

        //Then
        assertEquals(expected, actual);
    }
}


