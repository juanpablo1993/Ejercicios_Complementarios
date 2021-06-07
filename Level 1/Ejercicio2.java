import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese el primer numero a resolver:");
        int primer_numero = sc.nextInt();
        System.out.println("Por favor, ingrese el segundo numero a resolver: ");
        int segundo_numero = sc.nextInt();
        System.out.println("El resultado de la suma de los numeros es " + (primer_numero+segundo_numero));
        System.out.println("El resultado de la resta de los numeros es " + (primer_numero-segundo_numero));
        System.out.println("El resultado de la division de los numeros es " + (primer_numero/segundo_numero));
        System.out.println("El resultado de la multiplicacion de los numeros es " + (primer_numero*segundo_numero));
        System.out.println("El resultado del resto de la division es " + (primer_numero%segundo_numero));
        sc.close();
    }
}