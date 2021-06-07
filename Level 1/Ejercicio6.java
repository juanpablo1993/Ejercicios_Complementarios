import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese el primer numero a potenciar:");
        int primer_numero = sc.nextInt();
        System.out.println("Por favor, ingrese el segundo numero a potenciar:");
        int segundo_numero = sc.nextInt();
        int resultado = 1;
           for (int i = 1; i <= segundo_numero; i++) {
               resultado = resultado*primer_numero;
        }
        System.out.println(primer_numero + " elevado a " + segundo_numero + " = " + resultado);
        sc.close();
}
}