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
        // Given
        String palabra = "Zorro";
        String expected = "ZORRO";

        // When
        String actual = aMayusculas(palabra);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    // Prueba para el método aMinusculas(). Se espera que esta prueba verifique correctamente si una cadena se convierte a minúsculas.
    public void givenString_whenConvertToLowerCase_thenCorrectResult() {
        // Given
        String palabra = "Gilbert";
        String expected = "gilbert";

        // When
        String actual = aMinusculas(palabra);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    // Prueba para el método longitud(). Se espera que esta prueba verifique correctamente la longitud de una cadena.
    public void givenString_whenCalculateLength_thenCorrectResult() {
        // Given
        String nombre = "manuel";
        int expected = 6;

        // when
        int actual = longitud(nombre);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    // Prueba para el método esVacio(). Se espera que esta prueba verifique correctamente si una cadena es vacía.
    public void givenString_whenCheckIsEmpty_thenCorrectResult() {
        // Given
        String texto = "";

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
        assertEquals(sinEspacios, actual);
    }

    @Test
    // Prueba para el método contienePalabra(). Se espera que esta prueba verifique correctamente si una cadena contiene una palabra especifica.
    public void givenStringAndWord_whenCheckContainsWord_thenCorrectResult() {
        // Given
        String textoCompleto = "El sol sale todos los dias por la mañana.";
        String palabra = "sol";

        // When
        boolean actual = contienePalabra(textoCompleto, palabra);

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
        boolean actual = sonIguales(textoA, textoB);

        // Then
        assertTrue(actual);
    }

    @Test
    // Prueba para el método sonIgualesSinCasoSensitivo(). Se espera que esta prueba verifique correctamente si dos cadenas son iguales ignorando las diferencias de mayúsculas y minúsculas.
    public void givenTwoStrings_whenCheckAreEqualIgnoreCase_thenCorrectResult() {
        // Given
        String textoA = "pERRO" ;
        String textoB = "pErRo" ;

        //When
        boolean actual = sonIgualesSinCasoSensitivo(textoA, textoB);

        // Then
        assertTrue(actual);
    }

    @Test
    // Prueba para el método extraerHasta(). Se espera que esta prueba verifique correctamente si se extrae una subcadena desde un inicio hasta un fin.
    public void givenStringAndIndexes_whenExtractSubstring_thenCorrectResult() {
        // Given
        //                      ----------1---------2---------3---------4---------5---------
        //                      012345678901234567890123456789012345678901234567890123456789
        String textoCompleto = "El sol sale todos los dias por la mañana.";
        String expected = "dias";

        // When
        String actual = extraerHasta(textoCompleto,22,26);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    // Prueba para el método comienzaCon(). Se espera que esta prueba verifique correctamente si una cadena comienza con un prefijo especifico.
    public void givenStringAndPrefix_whenCheckStartsWith_thenCorrectResult() {
        // Given
        String palabra = "Intenso";
        String prefijo = "In";

        //When
       boolean actual = comienzaCon(palabra,prefijo);

        //Then
        assertTrue(actual);
    }

    @Test
    // Prueba para el método terminaCon(). Se espera que esta prueba verifique correctamente si una cadena termina con un sufijo especifico.
    public void givenStringAndSuffix_whenCheckEndsWith_thenCorrectResult() {
        // Given
        String palabra = "QUIERO TRABAJAR Y GANAR BUEN DINERO EN DOLARES";
        String sufijo = "RES";

        //When
        boolean actual = terminaCon(palabra, sufijo);

        //Then
        assertTrue(actual);
    }

    @Test
    // Prueba para el método reemplazar(). Se espera que esta prueba verifique correctamente si una cadena es reemplazada por otra.
    public void givenStringAndReplacement_whenReplace_thenCorrectResult() {
        // Given
        String decreto = "quiero trabajar y ganar buen dinero en dolares";
        String buscar = "dolares";
        String reemplazo = "euros";
        String expected = "quiero trabajar y ganar buen dinero en euros";


        //When
        String actual = reemplazar(decreto, buscar, reemplazo);

        //Then
        assertEquals(expected, actual);

    }
}
