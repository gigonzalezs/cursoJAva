
#Clase 01:
- Trabajando con variables y tipos de datos.


##Sobre el archivo DataTypeTest

### Como leer el codigo:


1. **Asignación de variables**:

   En JAVA: `int numero = 5;`

   En lenguaje natural: "Declaramos una variable llamada 'numero' de tipo entero y le asignamos el valor 5."

2. **Operaciones matemáticas básicas**:

   En JAVA: `int suma = numero + 10;`

   En lenguaje natural: "Declaramos una variable llamada 'suma' de tipo entero y le asignamos el resultado de sumar el valor de 'numero' y 10."

3. **Funciones y métodos**:

   En JAVA: `String nombreCompleto = getNombreCompleto("Juan", "Perez");`

   En lenguaje natural: "Declaramos una variable llamada 'nombreCompleto' de tipo cadena y le asignamos el resultado devuelto por la función 'getNombreCompleto' que recibe como parámetros los valores 'Juan' y 'Perez'."

4. **Estructuras de control - Condiciones**:

   En JAVA: `if (numero > 10) { System.out.println("El número es mayor a 10."); }`

   En lenguaje natural: "Si el valor de 'numero' es mayor a 10, entonces muestra en consola la frase 'El número es mayor a 10'."

5. **Estructuras de control - Bucles**:

   En JAVA: `for(int i = 0; i < 5; i++) { System.out.println(i); }`

   En lenguaje natural: "Para una variable llamada 'i' que comienza en 0, mientras 'i' sea menor a 5, imprime el valor de 'i' y luego incrementa 'i' en uno."

6. **Objetos y clases**:

   En JAVA: `Persona persona = new Persona("Juan", "Perez");`

   En lenguaje natural: "Creamos un objeto de tipo 'Persona' llamado 'persona', a través del uso del operador 'new', y proporcionamos 'Juan' y 'Perez' como parámetros para su constructor."



### Descripcion linea por linea:
**Línea 1:** Aquí usamos `package` para indicar que este archivo pertenece a un grupo específico de archivos relacionados en la misma carpeta o directorio.

**Líneas 3, 4, 5:** Aquí estamos usando `import` para poder usar herramientas y funciones que existen en otros programas en nuestro código actual. Es como si estuviésemos cogiendo prestada una herramienta de un amigo.

**Línea 7:** Define el inicio de nuestro programa, todo lo que se encuentra entre las llaves "{" y "}" en la última línea del archivo es parte de este programa.

**Líneas 9-11:** Aquí está nuestro primer subprograma llamado `main`. Cuando ejecutamos el programa, esto es lo primero que se ejecuta. En este caso, simplemente imprime el texto "Hello World!".

**Línea 13:** Aquí usamos `@Test`, que es una marca que ponemos antes de un subprograma para decir que este subprograma es una "prueba". Las pruebas son formas de verificar que nuestras herramientas (subprogramas) funcionan como queremos.

**Línea 14-17:** Este es un ejemplo de una de esas pruebas. Creamos dos cajas (variables) llamadas `expected` y `actual`. Ponemos cosas en las cajas y luego comparamos si lo que hay dentro es lo mismo. Si no es lo mismo, entonces algo salió mal y la prueba nos lo dirá.

**Línea 20:** Cualquier línea que comienza con `//` es un comentario y no se ejecutará. Los comentarios son notas que nos dejamos a nosotros mismos y a otras personas para entender mejor qué está pasando en nuestro programa.

El objetivo general de este programa es verificar que una herramienta que hemos creado llamada `getType()` funciona correctamente. `getType()` debería ser capaz de decirnos qué tipo de cosa (por ejemplo, texto, número entero, número con decimales, verdadero o falso) le hemos dado.

###Ejercicio 1:
Para el ejercicio 1, tu tarea es crear más pruebas como las que ves en las líneas 14-17. Tienes que usar la herramienta `getType()` y comprobar que puede identificar correctamente qué tipo de cosas le das. Recuerda que es importante verificar que nuestras herramientas estén funcionando correctamente, ¡por eso hacemos estas pruebas!

