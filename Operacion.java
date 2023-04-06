public class Operacion {
    public static void main(String[] args) {
        int operacion = 3;
        int num_1 = 5;
        int num_2 = 5;
        int resul = 0;
        
        if(operacion == 1){
            resul = num_1 + num_2;
            System.out.println("Resultado de la suma es: "+ resul);
        }else if(operacion == 2){
            resul = num_1 - num_2;
            System.out.println("Resultado de la resta es: "+ resul);
        }else if(operacion == 3){
            resul = num_1 * num_2;
            System.out.println("Resultado de la multiplicacion es: "+ resul);
        }else if(operacion == 4){
            resul = num_1 / num_2;
            System.out.println("Resultado de la division es: "+ resul);
        }else{
            System.out.println("No existe la opcion");
        }
    }
}
