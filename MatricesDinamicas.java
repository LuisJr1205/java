import java.util.Scanner;
public class MatricesDinamicas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
   
        int filas =0, columnas=0, contador=1;

        System.out.print("Ingresa las filas:");
        filas= entrada.nextInt();

        System.out.print("Ingresa las filas:");
        columnas= entrada.nextInt();
        
        int matriz[][] = new int[filas][columnas];
            
        for(int i=0; i < filas ; i++){
            for(int j=0; j< columnas ;j++){
                matriz[i][j] = contador;
                contador++; 
            }
        }

        System.out.println("La matriz queda de la siguiente manera");
        for(int i=0; i < filas ; i++){
            for(int j=0; j<columnas ;j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

    }
}
