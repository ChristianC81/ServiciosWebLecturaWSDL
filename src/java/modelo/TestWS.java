/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Scanner;
import sw.ConversionSW;
import sw.ConversionSW_Service;

/**
 *
 * @author chris
 */
public class TestWS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

        ConversionSW_Service servicio = new ConversionSW_Service();
        ConversionSW cliente = servicio.getConversionSWPort();

        System.out.println("Menú");
        System.out.println("Elija un opción: ");
        System.out.println(" 1. Ejemplo Guia Practica \n 2. Inicio de Sesión \n 3. Operaciones Básicas \n 4. Formulas Matematicas /Fisicas");
        int opc = scn.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Practica Guia");
                System.out.println("Resultado 1: " + cliente.hello("Christian"));
                System.out.println("Resultado 2: " + cliente.euroAdolar(100));
                break;
            case 2:
                System.out.println("----------------------------------------");
                System.out.println("------INICIO DE SESIÓN----");
                System.out.println("");

                System.out.println("Ingrese el nombre de usuario: ");
                String nombreu = sc.next();
                System.out.println("Ingrese su clave: ");
                String claveu = sc.next();

                if (cliente.login(nombreu, claveu)) {
                    System.out.println("Inicio exitosamente! :D");
                    System.out.println("Bienvenid@");
                } else {
                    System.out.println("Nombre de usuario o clave incorrectos D:");
                }
                break;

            case 3:
                System.out.println("--------------------------------------------------");
                System.out.println("-----------OPERACIONES BÁSICAS------------");

                System.out.println("¿Elija el número de la Que operación basica desea realizar?");
                System.out.println("Lista disponible: \n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division");
                int operacion = scn.nextInt();
                System.out.println("Listo!, Ingrese el primer numero:");
                float num1 = sc.nextFloat();
                System.out.println("Ingrese el segundo numero:");
                float num2 = sc.nextFloat();
                System.out.println("El total de su operación es: " + cliente.operacionesBasicas(num1, num2, operacion));

                break;
            case 4:
                System.out.println("--------------------------------------------------");
                System.out.println("-----------FORMULAS MATEMATICAS/FISICAS------------");
                System.out.println("¿Elija el número de la formula que desea operar?");
                System.out.println("Lista disponible: \n 1. Fomula de la Velocidad \n 2. Calcular Area \n 3. Formula de la Energia Cinetica");
                int fomula = scn.nextInt();
                if (fomula == 1) {
                    System.out.println("Fomula de la Velocidad = (distancia / tiempo)");
                    System.out.println("Ingrese la distancia: ");
                    float distancia = sc.nextFloat();
                    System.out.println("Ingrese el tiempo: ");
                    float tiempo = sc.nextFloat();
                    System.out.println("La velocidad promedio es de: " + cliente.formulaVelocidad(distancia, tiempo) + " km/h");
                } else {
                    if (fomula == 2) {
                        System.out.println("Área = π * radio^2");
                        System.out.println("Ingrese el radio: ");
                        float radio = sc.nextFloat();
                        System.out.println("El área es de: " + cliente.formulaArea(radio) + " cm²");
                    } else {
                        if (fomula == 3) {
                            System.out.println("Energía cinética = 0.5 * masa * (velocidad)^2 = 100 J  ");
                            System.out.println("Ingrese la masa en (Ejm: 10 kg): ");
                            float masa = sc.nextFloat();
                            System.out.println("Ingrese la velocidad (Ejm: 10 m/s): ");
                            float velocidad = sc.nextFloat();
                            System.out.println("LaEnergía cinética es de: " + cliente.formulaEnergiaCinetica(masa, velocidad) + " J");
                        }
                    }
                }
                break;
            default:
        }
    }
}
