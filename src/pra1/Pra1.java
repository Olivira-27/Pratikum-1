/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra1;

/**
 *
 * @author ASUS
 */
public class Pra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int b = 3;
       for (int i = 0; i <= b; i++) {
          for (int j = 0; j <= b; j++) {
             if  (i == 0 || j == 0 || i == b || j == b){
                System.out.print("@ ") ;     
       } else {
                System.out.print("  ");
            }
          }
            System.out.println();
       }
    }
}

    
    

