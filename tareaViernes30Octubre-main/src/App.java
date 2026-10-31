import java.util.Random;
import java.util.Scanner;

/*
        * Una cadena de tiendas de autoservicio cuenta con sucursales en C ciudades
        * diferentes del país,
        * en cada ciudad cuenta con T tiendas y cada tienda cuenta con N empleados,
        * asimismo, cada una registra lo que vende de manera individual cada empleado,
        * cuánto fue lo que vendió cada tienda,
        * cuánto se vendió en cada ciudad y
        * cuánto recaudó la cadena en un solo día.
        * Realiza un algoritmo que permita introducir en un día,
        * lo que vendió cada empleado de cada tienda de cada ciudad y saber las ventas
        * totales por tienda, por ciudad y totales.
        */
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("En cuantas ciudades tiene tiendas?:");
        int ciudades = sc.nextInt();
        sc.nextLine();
        System.out.println("Cuantas tiendas tiene?");
        int tienda = sc.nextInt();
        sc.nextLine();
        System.out.println("Cuantos trabajadores tiene?:");
        int trabajadores = sc.nextInt();
        int ventaTrabajador = rd.nextInt(1, 21);

        // Las ventas pueden tener decimales aunque en nuestro caso no
        int ventasTotales = 0;
        int ventasCiudades = 0;
        int ventasTiendas = 0;
        for (int i = 0; i < ciudades; i++) {
            for (int j = 0; j < tienda; j++) {

                for (int j2 = 0; j2 < trabajadores; j2++) {
                    // Habria que mostrar por consola lo que vendio cada trabajador.
                    System.out.println("Cuanto ha vendido el trabajador?");
                    // ventaTrabajador = rd.nextInt(1, 21);
                    ventaTrabajador = sc.nextInt();
                    System.out.println("El trabajador vendio: " + ventaTrabajador);

                    // Contador de la venta acumulada de los trabajadores
                    ventasTiendas += ventaTrabajador;
                }
                System.out.println("La cantidad de ventas de cada tienda es: " +ventasTiendas);
                // Contador de las ventas que hace CADA tienda
                ventasCiudades += ventasTiendas;
            }
            // Contador de las ventas que hay en CADA ciudad con x tiendas, se le va sumando
            // el valor de cada tienda a la variable
            // ventasTotales (acumulacion).
            ventasTotales += ventasCiudades;
            
        }

        System.out.println("La cantidad de ventas realizada por tienda es de: " + ventasTiendas);
        System.out.println("En cada ciudad se ha vendido: " + ventasCiudades);
        System.out.println("La cantidad de ventas totales realizadas es de : " + ventasTotales);

    }
}
