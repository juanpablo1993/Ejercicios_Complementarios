import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        ArrayList<Integer> horas = new ArrayList<Integer>(Arrays.asList(6,7,8,4,5));
        ArrayList<Integer> valor = new ArrayList<Integer>(Arrays.asList(350,345,550,600,320));
        ArrayList<Integer> totales = new ArrayList<Integer>();
        int total = 0;
        for (int i=0;i<horas.size();i++) {
            totales.add(horas.get(i)*valor.get(i));
            total = total + totales.get(i);
        }
        System.out.println(totales);
        System.out.println("Total Final: $" + total);
    }

}
