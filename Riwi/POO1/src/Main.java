
import java.util.Scanner;
public class Main {


        public static void main(String[] args) {


        Libro libro1 = new Libro("Limbo", "Chow Crown", "2004", true);

        //get propiedades
        System.out.println(libro1.getTitulo());

        //cambio el valor de el titulo
        libro1.setTitulo("100 Años de soledad");

        for (String prop : libro1.toString().split(",")) {
            System.out.println(prop);
        }


      }}