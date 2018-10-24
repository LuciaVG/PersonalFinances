/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinances;
 
import java.io.IOException;

/**
 *
 * @author bvlul
 */
public class PersonalFinances {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        FileReader fileReader = new FileReader("C:\\Users\\bvlul\\Desktop\\PersonalFinances\\src\\personalfinances\\input.txt");
        String[] input = fileReader.read();
        for(String x : input){
            System.out.println(x);
        }
        
        ConsoleReader consoleReader = new ConsoleReader();
        String[] input2 = consoleReader.read();
        for(String x : input2){
            System.out.println(x);
        }
        
    }
    
    
}
