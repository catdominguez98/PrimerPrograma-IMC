/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp.cdominguezg.imc;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SSPCDominguezGIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de IMC");
        //Paso 1. Declaración de variables (identificadores)
        double w, l, imc;
        String eIMC;
        //En la siguiente línea le indico a Java que utilizaré un teclado
        Scanner teclado=new Scanner(System.in);
        //Paso 2. Asignar valores a las variables
        System.out.println("Introduce el peso");
        w=teclado.nextDouble();
        System.out.println("Introduce la altura");
        l=teclado.nextDouble();
        //Paso 3. Resolver el problema
        imc=w/Math.pow(l, 2);
                //Paso 3.1. Evaluamos el IMC
        if(imc>25){
            eIMC= "Tienes sobrepeso";
        }else if(imc<19){
            eIMC="Tienes desnutrición";
        }else {
            eIMC="Tu IMC es normal";
        }
        //Paso 4. Mostrar el resultado
        System.out.println("Peso= " +w +"kg");
        System.out.println("Altura= " +l +"m");
        System.out.println("IMC= " +imc);
        System.out.println(eIMC);
    }
    
}
