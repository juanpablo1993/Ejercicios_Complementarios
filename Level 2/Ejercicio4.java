import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();
        lista.add("Jose");
        lista.add("Carlos");
        lista.add("Maria");
        lista.add("Lou");
        lista.add("Pablo");
        lista.add("Juan");
        lista.add("Matias");
        lista.add("Lucas");
        lista.add("Leonor");
        lista.add("Alberto");
        lista.add("Jorge");
        lista.add("Lisandro");

        List<String> cursoA = lista.subList(0, 4);
        List<String> cursoB = lista.subList(4, 8);
        List<String> cursoC = lista.subList(8, 12);
        System.out.println("Curso A: ");
        System.out.println(cursoA); 
        System.out.println("Curso B: ");
        System.out.println(cursoB); 
        System.out.println("Curso C: ");
        System.out.println(cursoC); 
    }
}
