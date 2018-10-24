/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinances;

import java.util.Scanner;

/**
 *
 * @author bvlul
 */

public class ConsoleReader implements Reader{
    
    private Scanner scanner;

    public ConsoleReader(){
        scanner = new Scanner(System.in);   
        
    }
    
    @Override
    public String[] read() {
        
        int linesCount = Integer.parseInt(scanner.nextLine());
        String[] rawLines = new String[linesCount];

        for (int i = 0; i < linesCount; i++){
            rawLines[i] = scanner.nextLine();
        }
        
        scanner.close();
        return rawLines;
    }
    
}
