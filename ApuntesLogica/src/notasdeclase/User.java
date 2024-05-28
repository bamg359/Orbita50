package notasdeclase;

import java.util.Scanner;

public class User {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] names = {"Maria" , "Juan" , "Pepito", "Luisa" , "Andrés"};

        int ages[] = new int[5];

        double salaries[] = new double[5];

        ages[0]= 19;
        ages[1] = 32;
        ages[2] = 25;
        ages[3] = 21;
        ages[4] = 45;


        System.out.println(ages[3]);
        System.out.println(ages.length);

        int i = 0;

        while(i < ages.length){

            System.out.println(ages[i]);

            i++;
        }


        //Vamos a ingresar los datos usando escanner  para tomar datos del sistema
        // y el ciclo while para que de manera automatica pida los 5 datos:

        int j=0;

        while(j< salaries.length){

            System.out.println("Ingrese el salario " + (j+1));
            salaries[j] = sc.nextDouble();
            j++;
        }

        // Ahora vamos a imprimir
        int k=0;
        while(k < salaries.length){
            System.out.println(salaries[k]);
            k++;
        }








    }

}
