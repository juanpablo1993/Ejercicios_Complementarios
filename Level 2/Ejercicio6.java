import java.util.*;

public class Ejercicio6{
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan","362785654",6,2000);
        Empleado empleado2 = new Empleado("Lou","40375248",7,2000);
        Empleado empleado3 = new Empleado("Mati","32798562",5,2000);
        Empleado empleado4 = new Empleado("Lucas","38978564",1,2000);
        Set<Empleado> empleados = new HashSet<>(){{
            add(empleado1);
            add(empleado2);
            add(empleado3);
            add(empleado4);
        }};
        Map<String, Integer> dniSueldo = new HashMap<>();
        for(Empleado i : empleados){
            dniSueldo.put(i.dni, i.sueldo());
        }
        System.out.println(dniSueldo.toString());
    }
    
    public static class Empleado{
        String nombre;
        String dni;
        int horasTrabajadas;
        int valorPorHora;
        public Empleado(String nom, String dni, int horas, int valor){
            this.nombre = nom;
            this.dni = dni;
            this.horasTrabajadas = horas;
            this.valorPorHora = valor;
        }
        public int sueldo(){
            return this.horasTrabajadas * this.valorPorHora;
        }
    }
}