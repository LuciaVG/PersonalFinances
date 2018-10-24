/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinances;
 
import java.text.DecimalFormat;

/**
 *
 * @author bvlul
 */
public class PersonalFinances {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator calculations= new Calculator();
        
        Format mexForm = new MexicanFormat();
        Format japForm = new JapaneseFormat();
        
        Report report = new DefaultReport();
        
        //String res= report.createReport(calculations, mexForm);
        String res= report.createReport(calculations, japForm);
        
        //Writer writer = new WriteToConsole();
        Writer writer = new WriteToFile();
        writer.write(res);
        
    }
    
}
