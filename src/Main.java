//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Ejercicio 1
        int lista[] = {12,10,10,9};
        double promedio = 0;

        for (int i = 0; i < lista.length;i++){
            promedio = promedio+lista[i];
        }
        promedio = promedio/ lista.length;
        System.out.println(promedio);

    }
}