import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Ejercicios5 {
    public static void main (String [] args) throws IOException {
        String path = "C:/Users/Juan Pablo/Desktop/Java/JavaEjercicio.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        List <Empleado> listaEmpleado = new ArrayList<Empleado>();

        while(line !=null) {
        String[] parts = line.split(",");
        String nombre= parts[0];
        String apellido= parts[1];
        LocalDate fecha= convertidorFecha(parts[2]);
        float sueldo= convertidorSueldo(parts[3]);  

        Empleado empleado1 = new Empleado();
        empleado1.setNombre(nombre);
        empleado1.setApellido(apellido);
        empleado1.setFecha(fecha);
        empleado1.setSueldo(sueldo);
        listaEmpleado.add(empleado1);
        line = br.readLine();
        }
        br.close();
        comparacionSueldo(listaEmpleado);
        comparacionEdad(listaEmpleado);
        letraDada(listaEmpleado);
    }
    public static class Empleado{
        private String nombre;
        private String apellido;
        private LocalDate fecha;
        private float sueldo;

        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getApellido(){
            return apellido;
        }
        public void setApellido(String apellido){
            this.apellido = apellido;
        }
        public LocalDate getFecha(){
            return fecha;
        }
        public void setFecha(LocalDate fecha){
            this.fecha = fecha;
        }
        public float getSueldo(){
            return sueldo;
        }
        public void setSueldo(float sueldo){
            this.sueldo = sueldo;
        }
    }
    public static LocalDate convertidorFecha(String fecha){
        LocalDate date1 = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return date1;
    }
    public static float convertidorSueldo(String sueldo1){
        float sueldo= Float.parseFloat(sueldo1); 
        return sueldo;
    }
    public static int convertidorEdad(LocalDate fecha) {
            LocalDate fechaDeHoy =LocalDate.now(); 
            Period diferencia = Period.between(fecha, fechaDeHoy);
            int edad= diferencia.getYears();
            return edad;
        }
    public static void letraDada(List<Empleado> listaEmpleado){
        Scanner sc= new Scanner(System.in);
        System.out.println("Por favor coloque una letra: ");
        String letra= sc.nextLine();
        char l=letra.charAt(0);
        for (int i=0; i <listaEmpleado.size();i++){
            String apellido=listaEmpleado.get(i).getApellido();
            char a=apellido.charAt(0);
            if (a==l){
            System.out.println(apellido);
            }
        sc.close();
        }
    }
    public static void comparacionEdad(List<Empleado>listaEmpleados){
        String nombreMasJoven = listaEmpleados.get(0).getNombre() + " " + listaEmpleados.get(0).getApellido();
        int edadMasJoven = convertidorEdad(listaEmpleados.get(0).getFecha());
        String nombreMasViejo = listaEmpleados.get(0).getNombre() + " " + listaEmpleados.get(0).getApellido();
        int edadMasViejo = convertidorEdad(listaEmpleados.get(0).getFecha());

        for (int i = 0; i <listaEmpleados.size(); i++) {
            int edad = convertidorEdad(listaEmpleados.get(i).getFecha());
            String nombreYApellido = listaEmpleados.get(i).getNombre() + " " + listaEmpleados.get(0).getApellido();
        
        if (edadMasJoven > edad) {
            edadMasJoven = edad;
            nombreMasJoven = nombreYApellido;
        }
        if (edadMasViejo < edad){
            edadMasViejo = edad;
            nombreMasViejo = nombreYApellido;

        }
        }
        System.out.println("El empleado mas joven es " + nombreMasJoven + " que tiene " + edadMasJoven);
        System.out.println("El empleado mas viejo es " + nombreMasViejo + " que tiene " + edadMasViejo);

        }
    public static void comparacionSueldo(List<Empleado>listaEmpleados){
        String nombreMenorSueldo = listaEmpleados.get(0).getNombre() + " " + listaEmpleados.get(0).getApellido();
        float menorSueldo = listaEmpleados.get(0).getSueldo();
        String nombreMayorSueldo = listaEmpleados.get(0).getNombre() + " " + listaEmpleados.get(0).getApellido();
        float mayorSueldo = listaEmpleados.get(0).getSueldo();

        for (int i = 0; i <listaEmpleados.size(); i++) {
            float dinero = listaEmpleados.get(i).getSueldo();
            String nombreYApellido = listaEmpleados.get(i).getNombre() + " " + listaEmpleados.get(0).getApellido();
        
        if (menorSueldo > dinero) {
            menorSueldo = dinero;
            nombreMenorSueldo = nombreYApellido;
        }
        if (mayorSueldo < dinero){
            mayorSueldo = dinero;
            nombreMayorSueldo = nombreYApellido;
        }
        }
        System.out.println("El empleado que menos gana es " + nombreMenorSueldo + " que cobra " + menorSueldo);
        System.out.println("El empleado que mas gana es " + nombreMayorSueldo + " que cobra " + mayorSueldo);
    }
}
