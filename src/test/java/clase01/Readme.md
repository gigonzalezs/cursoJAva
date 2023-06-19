
#Sobre el archivo DataTypeTest

linea 1: package se utiliza para agrupar archivos en la misma carpeta

linea 3,4,5: importan componentes de otros programas para poder usarlos en el programa actual

linea 7: Define el inicio de un programa, el cual esta contenido entre dos llaves "{" y "}" (ultima linea del archivo)

linea 9,10, 11: es un subprograma o subrutina llamada main que al ejecutarse solo imprime el texto "Hello World"

linea 13: define una etiqueta o anotacion para la subrutina de la linea 13

- @Test es una anotacion que indica que la subrutina debe ser tratada como una "prueba unitaria"

- Los programadores hacemos pruebas unitarias para validar que nuestro programa hace lo que tiene que hacer.

linea 14 define una subrutina de prueba llamada testGetTypeString

linea 15 define una variable de tipo String llamada expected y le asigna como valor el texto "String"

- Sintaxis: [Tipo] [nombre] [operador de asignacion] [valor a asignar]
- las variables siempre van a la izquierda del operador de asignacion (=)
- los valores a asignar siempre van a la derecha del signo igual
- En este caso se asigna un valor constante, el texto "String" nunca cambiara durante la vida del programa.
- Tambien se pueden asignar el valor de otra variable (ejemplo A = B)

linea 16 define otra variable de tipo String llamada actual y le asigna el resultado de una funcion. 

- Las funciones son subrutinas que devuelven un resultado despues de su ejecucion y este resultado se puede usar guardar en una variable tambien

- En este caso, la variable actual termina siendo igual al resultado de la funcion getType, la cual recibe como entrada un texto "Hola Mundo"

linea 17: se invoca a la subrutina llamada assertEquals, que recibe dos variables como entradas: expected y actual

- la subrutina assertEquals tiene el objetivo de confirmar (assert) que ambas entradas son iguales (equals). De ahi su nombre assertEquals.

linea 20: toda linea que comienza con doble slash "//" es un comentario

- los comentarios son textos utiles para el programador. nunca se ejecutan
- permiten identificar en lenguaje natural algunas partes del programa o lo que el programador desee dejar escrito para el futuro
- se dice "comentar" a la accion de dejar un comentario en el codigo
- se dice "descomentar" a la accion de remover el doble slash "//" al principio de una linea, dejando el comentario disponible para su ejecucion
- normalmente se decomentan lineas que si contienen codigo ejecutable