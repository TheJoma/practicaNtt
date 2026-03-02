import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Ejercicio 1

        /*
        int lista[] = {12,10,10,9};
        double promedio = 0;

        for (int i = 0; i < lista.length;i++){
            promedio = promedio+lista[i];
        }
        promedio = promedio/ lista.length;
        System.out.println(promedio);
        */

        //Ejercicio 2
/*
        int numero = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Ingrese numero :");
            numero = teclado.nextInt();
        } while (numero <= 2||numero%2==0);



        for (int i = 0; i < numero ; i++){
            for (int j = 0; j <= i ; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        for(int i = numero -2 ; i >= 0 ;i--){
            for (int j = 0; j <= i ; j++){
                System.out.print("#");
            }
            System.out.println();

        }
        teclado.close();*/

        //Ejercicio 3
        int lista[] = {6,9,-8,23,3,100,3};
        int num1 = lista[0];
        int num2 = lista[0];

        for(int i = 1; i < lista.length;i++){
            if (lista[i]<num1){
                num1=lista[i];
            }
            if (lista[i]>num2){
                num2=lista[i];
            }
        }

        System.out.println("num 1" + num1 +"num2 : "+ num2);

        //Ejercicio 4

        
        //Ejercicio 5
        //Ejercicio 6



    }
}