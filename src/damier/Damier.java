/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damier;

/**
 *
 * @author clement
 */
public class Damier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Boucle pour les lignes verticale
        for (int verticale = 1; verticale <= 6; verticale++) {
            
            // Boucle pour les lignes horizontal
            for (int horizontal = 1; horizontal <= 6; horizontal++) {

                // On détecte avec le modulo si la valeur de horizontal + verticale
                // est pair
                if ((verticale + horizontal) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
           
            // Retour à la ligne
            System.out.println("");
        } 
    }
    
}
