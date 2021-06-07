import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el primero numero a multiplicar: ");
        int primer_numero = sc.nextInt();
        System.out.println("Por favor ingrese el segundo numero a multiplicar: ");
        int segundo_numero = sc.nextInt();
        int resultado = 0;
            for ( int i = 1; i <= segundo_numero; i++) {
            resultado = resultado + primer_numero;
        }
        System.out.println(primer_numero + " X " + segundo_numero + " = " + resultado);
        sc.close();
    }
    
}
