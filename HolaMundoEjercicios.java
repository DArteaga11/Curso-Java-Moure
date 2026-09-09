public class HolaMundoEjercicios {

    public static void main(String[] args) {


        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".

        // Imprime la palabra "Hola Mundo"
        System.out.println("Daniel Arteaga");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.

        //En String se almacena la variable, al imprimir (H + " " + M); concatena las variables
        String H = "Hola";
        String M = "Mundo";

        System.out.println(H + " " + M);

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
                // LISTO

        // 4. Crea un comentario en varias líneas.

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        // Guarda mi edad
        int edad = 23;
        // Guarda mi color favorito
        String color = "Amarillo";
        // Guarda la ciudad donde vivo
        String ciudad = "Ciudad de Mexico";
        // Imprime el texto formado con las variables
        System.out.println("Mi edad es" + " " + edad + " " + "años"+ " " + "Mi color favorito es" + " " + color + " " + "Y vivo en" + " "+ ciudad);
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
          /*
            System.gc() - Pide a la maquina virtual ejecutar el recolector de basura
            System.in - Representa la entrada estandar de datos
            System.err - Muestra mensajes de error o adventencia en la consola de forma separada al flujo
            System.class - Realizar operaciones del sistema, como gestionar la entrada y salida de datos
          */

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Hola");
        System.out.println("esto es");
        System.out.println("un Ejercicio");

        System.out.println();
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("  *****  ");
        System.out.println(" * o o * ");
        System.out.println(" *  ^  * ");
        System.out.println(" * \\_/ * ");
        System.out.println("  *****  ");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        //No lo permite, puesto esto que el codigo se hace como si se estuviera comentando

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        //Marca un error el cual menciona que se debe declarar un archivo llamado igual que la clase
    }
}
