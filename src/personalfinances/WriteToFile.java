/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinances;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author skullgsus
 */
public class WriteToFile implements Writer{
    private static final String FILENAME = "C:\\Users\\skullgsus\\Desktop\\Code\\architecture\\PersonalFinances\\src\\personalfinances\\output.txt";
    
    @Override
    public void write(String report) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
                bw.write(report);
                bw.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
}
