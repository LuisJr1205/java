import java.util.Arrays;
import java.util.Scanner;;
public class VectoresDinamicos {
    public static void main(String[] args) {
        int longitud = 0; 
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuantos numero vas a ingresa?");
        longitud = entrada.nextInt();
        
        int numeros[] = new int[longitud];

        for(int i =0; i<numeros.length ; i++){
            System.out.println("Ingresa el Valor "+(i+1)+ " :");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("El vector ingresado queda de la siguiente manera");
        for(int i =0; i<numeros.length ; i++){
            System.out.print("["+ numeros[i] + "]");  
        }

        System.out.println(Arrays.toString(numeros));

    }
}
