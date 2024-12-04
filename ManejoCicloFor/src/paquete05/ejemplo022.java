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
        int valorfijo = 1;
        int contador = 1;
        int limite;
        int limite1;
        int resultado;
        String cadenaFinal = "";

        System.out.println("Ingrese las tablas que desea");
        limite = entrada.nextInt();
        System.out.println("Ingrese el limite de cada tabla");
        limite1 = entrada.nextInt();
        
        while (valorfijo <= limite) {
            while (contador <= limite1) {
                resultado = valorfijo * contador;
                cadenaFinal = String.format("%s%d * %d = %d\n", cadenaFinal,
                        valorfijo, contador, resultado);
                contador = contador + 1;
            }
            System.out.printf("%s-----------\n", cadenaFinal);
            cadenaFinal = "";
            contador = 1;
            valorfijo = valorfijo + 1;
        }
        
    }

}
