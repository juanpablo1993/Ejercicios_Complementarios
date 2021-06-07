  import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int primerNumero = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int segundoNumero = sc.nextInt();
        while (primerNumero>=segundoNumero) {
            System.out.println("El primer numero tiene que ser menor al segundo");
            System.out.print("Ingresa el segundo numero: ");
            segundoNumero = sc.nextInt();
        }
        if (primerNumero<=segundoNumero) {
            String[] lista = fizzBuzzFuncion(primerNumero, segundoNumero);
            System.out.println(Arrays.toString(lista));
        }
        sc.close();
    }


    public static String[] fizzBuzzFuncion (int a, int b) {
        

        ArrayList<String> lista = new ArrayList<String>() ;

        for (int i = a; i < b; i++) {
            
            if (i%3==0 && i%2 ==0) {
                lista.add("\""+"FizzBuzz"+"\"");
            }else if (i%3==0) {
                lista.add("\""+"Buzz"+"\"");

            }
            else if (i%2==0) {
                lista.add("\""+"Fizz"+"\"");

            }else{
                lista.add("\""+i+"\"");

            }
        }
        String [] resultado = lista.toArray(new String[lista.size()]);



        return resultado;
    }


}