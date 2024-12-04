/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

public class ejemplo022 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int valorfijo = 0;
        int contador = 0;
        int limite;
        int limite1;
        int resultado;

        System.out.println("Ingrese cuantas tablas desea");
        limite = entrada.nextInt();

        while (valorfijo <= limite) {
            System.out.println("Ingrese el numero del que quiera la tabla");
            valorfijo = entrada.nextInt();
            System.out.println("Ingrese el limite de la tabla");
            limite1 = entrada.nextInt();
            while (contador <= limite1) {
                resultado = valorfijo * contador;
                System.out.printf("%d * %d = %d\n", valorfijo, contador, resultado);
                contador = contador + 1;
            }
            contador = 1;

        }

    }

}
