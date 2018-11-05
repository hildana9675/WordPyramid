/* Hildana.M
 * WordPyramid.java
 * This program allows user to input a word and the program will remove 
 * the first and last letter until one (or two) letter is left. Creating a pyramid.
 * Nov/05/18
 */
package wordpyramid;
import javax.swing.*;

/**
 *
 * @author Hildana
 */
public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         String input = JOptionPane.showInputDialog("Please enter a word");
         //call method 
         pyramid(input);
         
    }
    
    public static void pyramid (String word){

     //if the length of word is greater than 2, 
     //then print the word until its no longer greater than 2
     if (word.length() > 2){
        System.out.println(word + "\n");
        //recursive call to pyramid()
        pyramid(word.substring(1, word.length()-1)); 
     } else {
         //if its less than 2, print the letter(s)
         //if the word is an odd number, the last line of the pyramid will print one letter 
         //if the word is an even number, the last line will print two letters 
         System.out.println(word);
     }
   }
}
