/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinances;

/**
 *
 * @author skullgsus
 */
public class WriteToConsole implements Writer{

    @Override
    public void write(String report) {
        System.out.println(report);
    }
    
}
