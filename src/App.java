import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Una cadena de tiendas de autoservicio cuenta con sucursales en C ciudades
         * diferentes del país,
         * en cada ciudad cuenta con T tiendas y cada tienda cuenta con N empleados,
         * asimismo, cada una registra lo que vende de manera individual cada empleado,
         * cuánto fue lo que vendió cada tienda, cuánto se vendió en cada ciudad y
         * cuánto recaudó la cadena en un solo día.
         * Realiza un algoritmo que permita introducir en un día,
         * lo que vendió cada empleado de cada tienda de cada ciudad y saber las ventas
         * totales por tienda, por ciudad y totales.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("En cuantas ciudades tiene tiendas?:");
        int ciudades = sc.nextInt();
        sc.nextLine();
        System.out.println("Cuantas tiendas tiene?");
        int tienda = sc.nextInt();
        sc.nextLine();
        System.out.println("Cuantos trabajadores tiene?:");
        int trabajadores = sc.nextInt();

        int ventas = 0;
        int ventasCiudades = 0;
        int ventasTiendas = 0;
        for (int i = 0; i < ciudades; i++) {
            for (int j = 0; j < tienda; j++) {
                for (int j2 = 0; j2 < trabajadores; j2++) {
                    ventas = ciudades * tienda * trabajadores;
                }
            }
        }
        System.out.println("La cantidad de ventas realizadas es de : " + ventas);
    }
}
