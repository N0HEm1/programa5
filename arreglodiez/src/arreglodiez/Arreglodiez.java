package arreglodiez;
import java.util.Scanner;
public class Arreglodiez {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int r;
      int[] num=new int[10];
       for(r=0;r<=9;r++)
       {
          System.out.print("ingresa valores: ");
        num[r]=leer.nextInt();   
       } 
        for(r=0;r<=9;r++)
        {
             System.out.print(" visualizar: "+num[r]);
        }
    }
    
}
