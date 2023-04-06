import java.util.Scanner;
public class Nombres {
    public static void main(String[] args) {
        String nombre_1 = "",nombre_2 = "";
   
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el primer nombre: ");
        nombre_1 = entrada.nextLine();

        System.out.print("Ingresa el segundo nombre: ");
        nombre_2 = entrada.nextLine();

        if(nombre_1.equalsIgnoreCase(nombre_2)){
            System.out.print("Los nombres son iguales");
        }else{
            System.out.print("Los nombres son diferentes");
        }

    }
}
