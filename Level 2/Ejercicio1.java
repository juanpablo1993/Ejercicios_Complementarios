import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la ciudad: ");
        String ciudad = sc.nextLine();
        lista.add(ciudad);
        int respuesta = 1;
        while (respuesta == 1) {
            System.out.println("Desea ingresar otra ciudad? Responda con el numero de la opcion: ");
            System.out.println("1. SI");
            System.out.println("2. NO");
            respuesta = sc.nextInt();
            sc.nextLine();
            if (respuesta == 1) {
                System.out.println("Ingrese la ciudad: ");
                String ciudades = sc.nextLine();
                lista.add(ciudades);
            }
        }
        System.out.println("");
        System.out.println("Su ranking de ciudades es: ");
        for (int i=0;i<lista.size();i++) {

            System.out.println("#" + (i+1) + " - "+ lista.get(i));
        }
        sc.close();
    }
} 
