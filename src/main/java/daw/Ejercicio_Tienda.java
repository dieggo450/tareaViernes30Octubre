/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Ejercicio_Tienda {

    public static void main(String[] args) {
        // Queremos saber cuantas tiendas tiene cada ciudad
        // Cuanto vendio cada ciudad
        // Cuanto gano la empresa
        // Cuanto vende cada emppleado de forma individual
        // Cuanto vendio cada tienda

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas ciudades tiene?: ");
        int ciudad = sc.nextInt();
        System.out.println("Cuantas tiendas tiene?: ");
        int tiendas = sc.nextInt();
        System.out.println("Cuantos empleados tiene?: ");
        int empleados = sc.nextInt();
        for (int i = 0; i < ciudad; i++) {
            int ventasCiudad = 0;
            for (int j = 0; j < tiendas; j++) {
                int ventasTiendas = 0;
                for (int k = 0; k < empleados; k++) {
                    System.out.println("Cuanto genero el empleado?: ");
                    int ventaEmpleado = sc.nextInt();

                    ventasTiendas += ventaEmpleado;
                }
            }
        }
    }
}
