import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese un numero:");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(x);
            }
            System.out.println();
        }
        sc.close();
    }
}
