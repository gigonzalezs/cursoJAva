package clase03;

import static clase02.Enteros.esPositivo;
import static clase03.Textos.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextosTest {

    @Test
    // Prueba para el método concatenar(). Se espera que esta prueba verifique correctamente si dos cadenas se concatenan.
    public void givenTwoStrings_whenConcatenate_thenCorrectResult() {
        // Given
        String name = "Pepe ";
        String lastName = "Cortisona";
        String expected= "Pepe Cortisona";

        // When
        String actual = concatenar(name, lastName);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    // Prueba para el método aMayusculas(). Se espera que esta prueba verifique correctamente si una cadena se convierte a mayúsculas.
    public void givenString_whenConvertToUpperCase_thenCorrectResult() {
        // TODO: Implement this test
    }

    @Test
    // Prueba para el método aMinusculas(). Se espera que esta prueba verifique correctamente si una cadena se convierte a minúsculas.
    public void givenString_whenConvertToLowerCase_thenCorrectResult() {
        // TODO: Implement this test
    }

    @Test
    // Prueba para el método longitud(). Se espera que esta prueba verifique correctamente la longitud de una cadena.
    public void givenString_whenCalculateLength_thenCorrectResult() {
        // TODO: Implement this test
    }

    @Test
    // Prueba para el método esVacio(). Se espera que esta prueba verifique correctamente si una cadena es vacía.
    public void givenString_whenCheckIsEmpty_thenCorrectResult() {
        // Given
        String texto = "esto_no_esta_vacio_y_debes_dejarlo_vacio";

        // When
        Boolean actual = esVacio(texto);

        // Then
        assertTrue(actual);
    }

    @Test
    // Prueba para el método removerEspacios(). Se espera que esta prueba verifique correctamente si se eliminan los espacios de una cadena.
    public void givenString_whenRemoveSpaces_thenCorrectResult() {
        // Given
        String conEspacios = " texto ";
        String sinEspacios = "texto";

        // When
        String actual = removerEspacios(conEspacios);

        // Then
    }

    @Test
    // Prueba para el método contienePalabra(). Se espera que esta prueba verifique correctamente si una cadena contiene una palabra especifica.
    public void givenStringAndWord_whenCheckContainsWord_thenCorrectResult() {
        // Given
        String textoCompleto = "El sol sale todos los dias por la mañana.";
        String palabra = "sol";

        // When
        boolean actual = contienePalabra(textoCompleto, ?);

        // Then
        assertTrue(actual);
    }

    @Test
    // Prueba para el método sonIguales(). Se espera que esta prueba verifique correctamente si dos cadenas son iguales.
    public void givenTwoStrings_whenCheckAreEqual_thenCorrectResult() {
        // Given
        String textoA = "Perro";
        String textoB = "Perro";

        // When
        boolean actual = ?

        // Then
        assertTrue(actual);
    }

    @Test
    // Prueba para el método sonIgualesSinCasoSensitivo(). Se espera que esta prueba verifique correctamente si dos cadenas son iguales ignorando las diferencias de mayúsculas y minúsculas.
    public void givenTwoStrings_whenCheckAreEqualIgnoreCase_thenCorrectResult() {
        // TODO: Implement this test
    }

    @Test
    // Prueba para el método extraerHasta(). Se espera que esta prueba verifique correctamente si se extrae una subcadena desde un inicio hasta un fin.
    public void givenStringAndIndexes_whenExtractSubstring_thenCorrectResult() {
        // Given
        String textoCompleto = "El sol sale todos los dias por la mañana.";
        String expected = "sol";

        // When
        String actual = extraerHasta(textoCompleto,3,5);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    // Prueba para el método comienzaCon(). Se espera que esta prueba verifique correctamente si una cadena comienza con un prefijo especifico.
    public void givenStringAndPrefix_whenCheckStartsWith_thenCorrectResult() {
        // TODO: Implement this test
    }

    @Test
    // Prueba para el método terminaCon(). Se espera que esta prueba verifique correctamente si una cadena termina con un sufijo especifico.
    public void givenStringAndSuffix_whenCheckEndsWith_thenCorrectResult() {
        // TODO: Implement this test
    }

    @Test
    // Prueba para el método reemplazar(). Se espera que esta prueba verifique correctamente si una cadena es reemplazada por otra.
    public void givenStringAndReplacement_whenReplace_thenCorrectResult() {
        // TODO: Implement this test
    }
}
