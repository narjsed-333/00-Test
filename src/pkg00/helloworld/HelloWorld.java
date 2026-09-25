/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.helloworld;
import java.util.Scanner;
/**
 *
 * @author nseddiki
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world");
       
        // TODO code application logic here permutationsde valeurs
        
        System.out.print("Inserer une valeur x ");
        x = sc.nextInt();
        
      
             System.out.print("Inserer une valeur y ");
        y = sc.nextInt();   
        y = sc.nextInt();
        
        System.out.print("x:" +x + "y:" +y );
        
        int z=0;
        
       z=x;
       x=y;
       y=z;
        
        System.out.print("x:" +x + "y:" +y );
        
    }
    
}
