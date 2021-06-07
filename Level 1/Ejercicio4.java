import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, ingrese un numero para obtener el factorial: ");
        int numero = sc.nextInt();
        int resultado = 1;
            for (int i = 1; i <= numero; i++) {
                resultado = resultado*i;
            }
        System.out.println("El factorial de " + numero + " es: " + resultado);
        sc.close();
    }   
    
}
