/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisorpor3;

import java.util.Scanner;

/**
 *
 * @author leandro.osouza
 */
public class Divisorpor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
     System.out.println("Digite o valor:");
        int dividir;
        dividir = leia.nextInt();
  if (dividir % 3 == 0){
      
      System.out.println("Numero é divido por 3");
}
else {
     System.out.println("Numero não é divido por 3");
}
    
    }
}
    
    
    

