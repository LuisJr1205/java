import java.util.Scanner;;
public class Cadena {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String cadena_original="",cadena_subs="";
        int no_caracteres =0, desde=0, hasta=0;

        System.out.print("Ingrese la cadea:");
        cadena_original= in.nextLine();
        no_caracteres = cadena_original.length();
        System.out.println("La cadena: " + cadena_original +" tiene " + no_caracteres + " de caracteres");
        System.out.print("Ingresa desde:");
        desde = in.nextInt();
        System.out.print("Ingresa hasta:");
        hasta = in.nextInt();
        
        cadena_subs = cadena_original.substring(desde,hasta);

        System.out.print("Esta es la cadena recortada " + cadena_subs);
    }
}
