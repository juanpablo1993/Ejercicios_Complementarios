import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra que desea pasar a mayusculas:");
        String palabra = sc.nextLine();
        String result = "";
            for (int i = 0; i < palabra.length(); i++) {
                int v = palabra.charAt(i);
                if (v > 96 && v < 123) {
                    v = v - 32;
                }
                result+=(char)v;

            }
        System.out.println(result);
        sc.close();

    }
}
