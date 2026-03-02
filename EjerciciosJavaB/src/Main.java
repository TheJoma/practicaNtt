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
        /*
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
*/
        //Ejercicio 4
        /*
        int num[] = {10,2,1,30};
        int i;
        int temp;

        for (int j = 0 ; j<num.length-1;j++){
            for(i = 0; i< num.length-1;i++){
                if (num[i] < num[i+1]){
                    temp = num[i];
                    num[i] = num[i+1];
                    num[i+1]=temp;
                }
            }
        }

        System.out.println(num[0] + "&" + num[num.length-1]); */


        //Ejercicio 5

        System.out.println("########################### Menu ##################");
        System.out.println("Marque 1: Para Consultar Saldo");
        System.out.println("Marque 2: Para Recargar Saldo");
        System.out.println("Marque 3: Para Iniciar Sesion");
        System.out.println("Marque 4: Para Salir");

        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        teclado.nextLine();

        try {
            if (numero == 3){
                System.out.println("ingrese dni: ");
                String dni = teclado.nextLine();

                Integer.parseInt(dni);

                System.out.println("ingrese clave: ");
                String clave = teclado.nextLine();


                Integer.parseInt(clave);

                if(clave.equals("1930")){
                    System.out.println("Bienvenido");
                }else {
                    System.out.println("Clave incorrecta");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Solo se permiten numeros");
        }





    }
}