import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        System.out.println("Cartas ordenadas: ");
        for (int i=0;i<lista.size();i++) {

            System.out.print(lista.get(i));
        }
        System.out.println();
        System.out.println("Cartas ordenadas inversamente: ");
        Collections.reverse(lista);
        for (int i=0;i<lista.size();i++) {

            System.out.print(lista.get(i));
        }
        System.out.println();
        System.out.println("Cartas desordenadas: ");
        Collections.shuffle(lista);
        for (int i=0;i<lista.size();i++) {

            System.out.print(lista.get(i));
        }
    }
}
