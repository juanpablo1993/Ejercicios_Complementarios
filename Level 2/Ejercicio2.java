import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i=1; i <6; i++) {
            System.out.print("Ingrese un numero entero: ");
            int numero = sc.nextInt();
            lista.add(numero);
        }
        System.out.print("Ingrese un numero entero para colocar al principio de la lista: ");
        int numero = sc.nextInt();
        lista.add(0, numero);
        System.out.print("Ingrese un numero entero para colocar al final de la lista: ");
        numero = sc.nextInt();
        lista.add(numero);
        for (int i=0;i<lista.size();i++) {

            System.out.println(lista.get(i));
        }
        System.out.println("El tamaño de la lista es: " + lista.size());
        sc.close();
        
    }

}
