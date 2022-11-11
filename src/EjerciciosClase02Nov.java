import java.sql.SQLOutput;
import java.util.Scanner;

public class EjerciciosClase02Nov {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4 = 0;
        double promedio = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese la primera nota");
        nota1 = in.nextDouble();
        System.out.println("Ingrese la segunda nota");
        nota2= in.nextDouble();
        System.out.println("Ingrese la tercera nota");
        nota3 = in.nextDouble();
        System.out.println("Ingrese la cuarta nota");
        nota4 = in.nextDouble();

        promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("El promedio es = " + promedio);






    }
}
