/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinances;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bvlul
 */
public class FileReader implements Reader {
    
        private Scanner scanner;

    public FileReader(String path) throws IOException {
        scanner = new Scanner(new File(path));
  
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
