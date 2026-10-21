public class EjerciciosOperadores {
    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 10;
        int b = 5;
        System.out.println(("El resultado de la suma es:") + (a + b));
        System.out.println(("El resultado de la resta es:") + (a - b));
        System.out.println(("El resultado de la division es:") + (a * b));
        System.out.println(("El resultado de la multiplicación es:") + (a / b));
        System.out.println(("El el sobrante de una division es:") + (a % b));

        // 2. Crea una variable para cada tipo de operación de asignación.
        int x = 5;
        System.out.println(x += 1);
        System.out.println(x -= 1);
        System.out.println(x *= 1);
        System.out.println(x /= 1);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        int y = 20;
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x != y);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x == y);

        // 5. Utiliza el operador lógico and.
        int años = 20;
        boolean tieneIne = true;
        boolean puedeVotar = años >= 18 && tieneIne;

        // 6. Utiliza el operador lógico or.
        boolean admin = false, mod = true;
        boolean acceso = admin || mod;

        // 7. Combina ambos operadores lógicos.
        boolean vip = true; double total = 300;
        boolean envioGratis = total > 500 || (vip && total > 200);

        // 8. Añade alguna negación.
        boolean bloqueado = false;
        boolean activo = !bloqueado;

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int z = 100;
        System.out.println(-z);
        System.out.println(++z);
        System.out.println(z++);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        int edad = 24;
        double dineroDisponible = 500.0;
        double precioBoleto = 300.0;
        double consumoMinimo = 150.0;

        boolean puedeEntrar = edad >= 18 && dineroDisponible >= (precioBoleto + consumoMinimo);

        System.out.println("¿Puede ingresar al evento?" + puedeEntrar);

    }
}
