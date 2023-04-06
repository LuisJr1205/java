import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        String user = "", password = "";   
        Scanner entrada = new Scanner(System.in);
     
        System.out.print("Ingresa el usuario:");
        user=entrada.nextLine();
        
        System.out.print("Ingresa la contraseña:");
        password=entrada.nextLine();
        
        if(user.equals("luis") && password.equals("120599")){
          System.out.println("Inicio de sesion correcto");
        }else{
          System.out.println("Nombre de usuario o contraseña incorrectos");
        }
    }
}
