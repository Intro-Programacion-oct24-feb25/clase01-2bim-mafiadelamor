/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int num = 1;
        int num2 = 1;
        int num3;
        int tabla;
        int mult;
        String cadena = "";

        System.out.println("Ingrese el número de tablas");
        num3 = entrada.nextInt();

        System.out.println("Ingrese límite de tabla");
        tabla = entrada.nextInt();

        while (num <= num3) {
            while (num2 <= tabla) {
                System.out.println(num + "*" + num2 + "=" + (num * num2));
                num2++;

            }
            num2=1;
            num++;

        }

    }
}
