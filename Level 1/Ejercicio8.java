import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre y Apellido: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        String edad = sc.nextLine();
        System.out.print("Direccion: ");
        String direccion = sc.nextLine(); 
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();
        System.out.println();
        System.out.print("Datos: " + nombre + " - " + edad + " - " + direccion + " - " + ciudad);
        sc.close();
    }
}
