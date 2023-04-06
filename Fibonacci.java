public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b=1, c=0, i=0;
        System.out.println("Serie con For");
        for(i=0; i<10 ; i++){
          if(i<9){
          System.out.print(a+",");
          c=a+b;
          a=b;
          b=c;
          }else{
          System.out.print(a);
          }
        }
     
        System.out.println("\nSerie con While");
        a = 0;
        b=1; 
        c=0; 
        i=0;   
        
        while(i<10){
         if(i<9){
           System.out.print(a+",");
           c=a+b;
           a=b;
           b=c;
           }else{
           System.out.print(a);
           }
         i++;
        }
     
        System.out.println("\nSerie con Do-While");
        a = 0;
        b=1; 
        c=0; 
        i=0;
        do{
         if(i<9){
           System.out.print(a+",");
           c=a+b;
           a=b;
           b=c;
         }else{
           System.out.print(a);
         }
         i++;
        }while(i<10);  
    }
}
