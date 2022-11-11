import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numUno= 0, numDos = 0, resultado = 0;

        System.out.println("Ingrese el primer valor");
        numUno = in.nextInt();

        System.out.println("ingrese el segundo valor");
        numDos = in.nextInt();

        resultado = numUno + numDos;

        System.out.println("el resultado de la suma es: " + resultado);






    }
}