import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, ingrese una oracion: ");
        String oracion = sc.nextLine();
        System.out.print("Ingrese la letra que desea saber cuantas veces se repite:");
        String letra = sc.nextLine();
        int resultado = 0;
            for (int i = 0; i < oracion.length(); i++) {
                int v = oracion.charAt(i);
                int x = letra.charAt(0);
                if (v == x) {
                    resultado = resultado + 1;
                }   
            }
        System.out.println(resultado);
        sc.close();
        }
    }