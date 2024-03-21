
package com.mycompany.exerciciosfuncoes;

import java.util.Scanner;

public class Exerciciosfuncoes {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       Scanner teclado2 = new Scanner (System.in);
       
       
        
        System.out.println("aperte enter para ir ao calculo");
        String enter  = teclado2.nextLine();
              
               
       
        System.out.println("digite o primeiro numero :");
        int num1 = teclado.nextInt();
     
        System.out.println("digite o sinal desejado"
                + "\n+"
                + "\n-"
                + "\n*"
                + "\n/");
        String  sinal = teclado2.nextLine();
        
        System.out.println("digite o segundo numero:");
        int num2 = teclado.nextInt();
       
        System.out.println("o resultado é: " + calculadora (num1, num2, sinal));
    }
        public static int calculadora (int num1, int num2,String sinal){
            if(sinal.equalsIgnoreCase("+")){
              return num1+ num2;
            }else if (sinal.equalsIgnoreCase("-")){
               return num1- num2;
            }else if (sinal.equalsIgnoreCase("*")){
                return num1* num2;
            }else if (sinal.equalsIgnoreCase("/")){
                return num1/num2;
            }
            
            System.out.println("Você não digitou um caracter valido!");
        return 0;       
        }
        }
      

