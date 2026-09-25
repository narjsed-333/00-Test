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
        
        
          /* 4) permutations de valeurs 
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world");
       
         
        
        System.out.print("Inserer une valeur x ");
        x = sc.nextInt();
        
      
             System.out.print("Inserer une valeur y ");
         
        y = sc.nextInt();
        
        System.out.print("x:" +x + "y:" +y );
        
        int z=0;
        
       z=x;
       x=y;
       y=z;
        
        System.out.print("x:" +x + "y:" +y );
        
       
    // exerice 5
        
    Scanner sc = new Scanner(System.in);

          System.out.print("a:");
          float a = sc.nextFloat(); 
          
          System.out.print("b:");
          float b = sc.nextFloat();
          
          float resultat=(a+b)*2;
                  
           System.out.print("Resultat" + resultat);
           
           */
             
          //exercice 3 (TP02)
          
           Scanner sc = new Scanner(System.in);
           int opt;
          
          
          do{
          System.out.print(" Option :");
          opt = sc.nextInt();
          
       
          if(opt==1){
              System.out.print("Bonjour");
        }
        
          else if(opt==2) {
          System.out.print("Au revoir");
          }
          
          } while(opt!=0);
          
                   
        
    }
    
}
