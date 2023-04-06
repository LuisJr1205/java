import java.util.Scanner;;
public class Sumadatos {
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            String nombre = "";
            int num_1 = 0, num_2 = 0, resul = 0;
            
            System.out.println("¿Cual es tu nombre?");
            nombre = in.nextLine();

            System.out.println("Dame el primer numero:");
            num_1 = in.nextInt();

            System.out.println("Dame el segundo numero:");
            num_2 = in.nextInt();

            resul = num_1 + num_2;
            System.out.println("Hola " + nombre + " resultado de tu suma es: " + resul);
        }

    }
}
