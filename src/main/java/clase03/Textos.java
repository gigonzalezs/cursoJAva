package clase03;

public class Textos {

    public static String concatenar (String a, String b) {
        return a + b;
    }

    public static String aMayusculas(String texto) {
        return texto.toUpperCase();
    }

    public static String aMinusculas(String texto) {
        return texto.toLowerCase();
    }

    public static int longitud(String texto) {
        return texto.length();
    }

    public static boolean esVacio(String texto) {
        return texto.isEmpty();
    }

    public static String removerEspacios(String texto) {
        return texto.trim();
    }

    public static boolean contienePalabra (String texto, String palabra) {
        return texto.contains(palabra);
    }

    public static boolean sonIguales (String a, String b) {
        return a.equals(b);
    }

    public static boolean sonIgualesSinCasoSensitivo (String a, String b) {
        return a.equalsIgnoreCase(b);
    }

    public static String extraerHasta (String texto, int inicio, int fin) {
        return texto.substring(inicio, fin);
    }

   public static boolean comienzaCon(String texto, String prefijo) {
        return texto.startsWith(prefijo);
   }

    public static boolean terminaCon(String texto, String sufijo) {
        return texto.endsWith(sufijo);
    }

    public static String reemplazar(String texto, String buscar, String reemplazo)  {
        return texto.replace(buscar, reemplazo);
    }
}
