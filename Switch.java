public class Switch {
    public static void main(String[] args) {
        int num_1 = 5, num_2 = 3, resul = 0;
        int parametro = 3;
        
        switch(parametro){
            
            case 1: resul = num_1 + num_2;
                System.out.println("Resultado Suma:" + resul);
                    break;
            case 2: resul = num_1 - num_2;
                System.out.println("Resultado resta:" + resul);
                    break;
            case 3: resul = num_1 * num_2;
                System.out.println("Resultado multiplicacion:" + resul);
                    break;
            case 4: resul = num_1 / num_2;
                System.out.println("Resultado division:" + resul);
                    break;
            default: System.out.println("No existe la opcion");
                    break;
        }
    }
}
