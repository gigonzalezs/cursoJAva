package clase01;

import org.junit.jupiter.api.Test;
import static clase01.DataTypes.getType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTypesTest {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Test
    public void testGetTypeString() {
        String expected = "String";
        String actual = getType("Hola Mundo");
        assertEquals(expected, actual);
    }

    // Esto es un comentario: no se ejecuta.

    @Test
    public void testGetTypeInteger() {
        String expected = "Integer";
        String actual = getType(5);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTypeDouble() {
        String expected = "Double";
        String actual = getType(3.55);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTypeFloat() {
        String Naty = "Float";
        String Gb = getType(3.55);
        assertEquals(Naty, Gb);
    }

    @Test
    public void testGetTypeBoolean() {
        String expected = "Boolean";
        String actual = getType(true);
        assertEquals(expected, actual);
    }

    @Test
    public void testVerifyValueIsBoolean() {
        Boolean value = false;
        String expected = "Boolean";
        String actual = getType(value);
        assertEquals(expected, actual);
    }

    @Test
    public void testVerifyValueIsInteger() {
        Integer value = 3;
        String expected = "Integer";
        String actual = getType(value);
        assertEquals(expected, actual);
    }

    // EJERCICIO 1
    // Tomando testVerifyFalseIsBoolean y testVerify10IsInteger como base:
    // - Descomentar lineas si es necesario
    // - Completar o agregar las lineas faltantes
    // - observa que cada subrutina de prueba a corregir siempre debe contener 4 lineas de codigo

    @Test
    public void testVerifyValueIsBooleanToo() {
        Boolean value = true;
        String expected = "Boolean";
        String actual = getType(value);
        assertEquals(expected, actual);
    }

    @Test
    public void testVerifyValueIsDouble() {
        Double value = 3.5;
        String expected = "Double";
        String actual = getType(value);
        assertEquals(expected, actual);
    }

    @Test
    public void testVerifyValueIsIntegerToo() {
        Integer value = 2;
        String expected = "Integer";
        String actual = getType(value);
        assertEquals(expected, actual);
    }

    @Test
    public void testVerifyValueIsStringToo() {
        String value = "esto es un texto";
        String expected = "String";
        String actual = getType (value);
        assertEquals(expected, actual);
    }

}