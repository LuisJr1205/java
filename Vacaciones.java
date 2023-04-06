import  java.util.Scanner;;
public class Vacaciones {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String nombre = "";
            int clave = 0, anti = 0;

            System.out.println("Bienvenido  al sistema vacional\n");
            
            System.out.println("¿Cual es tu nombre?");
            nombre = entrada.nextLine();

            System.out.println("Años de servicio:");
            anti = entrada.nextInt();

            System.out.println("Clave del departamento:");
            clave = entrada.nextInt();

            if(clave == 1){
                if(anti == 1){
                System.out.println(nombre + " derecho a 6 dias");
                }else if(anti >= 2 && anti <= 6){
                System.out.println(nombre + " derecho a 14 dias");
                }else if(anti >= 7){
                System.out.println(nombre + " derecho a 20 dias");
                }else{
                System.out.println(nombre + " aun no tienes derechos de vacaiones");
                }
            
            }else if(clave == 2){
                if(anti == 1){
                System.out.println(nombre + " derecho a 7 dias");
                }else if(anti >= 2 && anti <= 6){
                System.out.println(nombre + " derecho a 15 dias");
                }else if(anti >= 7){
                System.out.println(nombre + " derecho a 22 dias");
                }else{
                System.out.println(nombre + " aun no tienes derechos de vacaiones");
                }
            
            }else if(clave == 3){
                if(anti == 1){
                System.out.println(nombre + " derecho a 10 dias");
                }else if(anti >= 2 && anti <= 6){
                System.out.println(nombre + " derecho a 20 dias");
                }else if(anti >= 7){
                System.out.println(nombre + " derecho a 30 dias");
                }else{
                System.out.println(nombre + " aun no tienes derechos de vacaiones");
                }
            
            }else{
                System.out.println("No existe la clave introducida");
            }
        }

    }
}
