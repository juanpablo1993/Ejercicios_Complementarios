import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese su nombre: ");
        String nombre_usuario = sc.nextLine();
        System.out.println("HOLA " + nombre_usuario);
        sc.close();
    }
}