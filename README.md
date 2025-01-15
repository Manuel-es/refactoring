1-  Implementar un programa que lea 5 números por teclado, los copie a otro array multiplicados por 2 y los muestre todos ordenados usando un tercer array.

COMENTARIO SILVIA:
- Uso de un arreglo ( int[] numeros): Permite almacenar los números de manera más estructurada, eliminando la necesidad de variables separadas ( a, b, c, etc.).
- Multiplicación al momento de leer: Se multiplica cada número por 2 directamente al ingresarlo, reduciendo líneas innecesarias.
- Ordenación con Arrays.sort: Sustituye la larga secuencia de intercambios manuales por un método optimizado y confiable.
- Bucles para leer e imprimir: El uso de bucles simplifica la lógica, reduciendo la repetición de código.

2- Se creará un programa que genere una tabla de caracteres de 20 elementos cargado con vocales de manera aleatoria. Contar e imprimir el número de veces que aparece cada vocal.

3- Diseñar un programa que solicite al usuario que introduzca por teclado 5 números decimales a continuación, debe mostrar los números en el mismo orden que se han introducido

4- Desarrollar el juego la cámara secreta, que consiste abrir una cámara mediante su combinación secreta, que está formado por una combinación de dígitos del uno al cinco. El jugador especificará cuál es la longitud de la combinación, a mayor longitud mayor será la dificultad del juego. La aplicación genera, de forma aleatoria, una combinación
secreta que el usuario tendrá que acertar. En cada intento se muestra como pista, para cada dígito de la combinación introducido por el jugador, si es mayor, menor o igual que el correspondiente en la combinación secreta.

5- Leer una serie de n enteros que se almacenarán en una tabla que hay que ordenar y mostrar. Leer otra serie de m enteros, que también se guardarán en una tabla y se mostrarán ordenados. A continuación, fusionar las dos tablas en una tercera, de forma que los n+m números sigan ordenados, mostrar primero ascendentemente y luego descendentemente.

ejercicios 2 
Variables redundantes:
Definición de cada vocal (v1, v2, ..., v5) de forma innecesaria antes de crear el array vocales.
Condicionales largos:
Uso de if-else en lugar de un switch, lo que genera un código más extenso.
Nombres genéricos y poco claros:
Uso de nombres como f para frecuencias y tabla para las vocales aleatorias.
Impresión menos optimizada:
Evitar funciones compactas como Arrays.toString() para imprimir los arrays.
Este código, aunque funcional, es menos legible y más propenso a errores en caso de cambios futuros.
