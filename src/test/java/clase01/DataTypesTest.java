package clase01;

import org.junit.jupiter.api.Test;
import static clase01.DataTypes.getType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTypesTest {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }

    // EJERCICIO 1
    // ejecuta la subrutina Main haciendo clic en la flecha verde de la linea 9 y observa su resultado

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
        String expected = "Float";
        String actual = getType(3.55f);
        assertEquals(expected, actual);
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
        Integer value = 10;
        String expected = "Integer";
        String actual = getType(value);
        assertEquals(expected, actual);
    }

    // EJERCICIO 2
    // ejecuta todos los tests haciendo clic en la flecha verde de la linea 7 y observa su resultado

    // EJERCICIO 3: usando el depurador
    // En la linea 27 coloca un breakpoint (punto de parada) haciendo click al lado del numero de linea.
    // deberia aparecer un circulo rojo y toda la linea se resalta en rojo automaticamente.
    // el breakpoint pausa la ejecucion del programa y te permite continuar la ejecucion linea por linea.
    // luego de colocar el breakpoint, haz clic derecho sobre la flecha verde en la linea 26 y seleccionas
    // la opcion debug del menu contextual (el menu que sale cuando haces click derecho sobre algo)
    // continua la ejecucion paso a paso y observa los valores de las variables como cambian

    // EJERCICIO 3
    // En el bloque de codigo del test testGetTypeInteger (linea 26) renombra las variables expected y actual
    // por nombres de tu preferencia y ejecuta el test de nuevo en modo debug. observa como se comporta en cada linea.

    // EJERCICIO 4
    // En la line 42 remueve la "f" al final de "3.55f" y ejecuta el test en modo run. observa el resultado.
    // el test debe fallar.
    // Ejecutalo de nuevo en modo debug y observa por que realmente esta fallando el test.
    // luego vuelve a colocar la "f" dejando "3.55f" como antes y vuelve a ejecutar el test y observa el resultado

    // EJERCICIO 5
    // Tomando testVerifyFalseIsBoolean y testVerify10IsInteger como base:
    // - Descomentar lineas si es necesario
    // - Completar o agregar las lineas faltantes
    // - observa que cada subrutina de prueba a corregir siempre debe contener 4 lineas de codigo

    @Test
    public void testVerifyValueIsBooleanToo() {
        Boolean value = true;
        String expected = "Boolean";
        String actual = getType(value);
        //assertEquals(expected, actual);
    }

    @Test
    public void testVerifyValueIsDouble() {
        Double value = 3.5;
        String expected = "Double";
        String actual = getType(value);
    }

    @Test
    public void testVerifyValueIsIntegerToo() {
        Integer value = 2;
        String actual = getType(value);
        //assertEquals(expected, actual);
    }

    @Test
    public void testVerifyValueIsStringToo() {
        String value = "esto es un texto";
        String expected = "String";
        //assertEquals(expected, actual);
    }

}