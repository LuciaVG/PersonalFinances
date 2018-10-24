/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinances;
 
import java.io.IOException;
import java.text.DecimalFormat;

/**
 *
 * @author bvlul
 */
public class PersonalFinances {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Reader reader = new ConsoleReader();
        Reader reader = new FileReader("C:\\Users\\skullgsus\\Desktop\\Code\\architecture\\PersonalFinances\\src\\personalfinances\\input.txt");
        
        FinancesSplitter splitter = new FinancesSplitter();
        
        
        
        Format mexForm = new MexicanFormat();
        Format japForm = new JapaneseFormat();
        
        Report report = new DefaultReport();
        
        Writer writer = new WriteToConsole();
        //Writer writer = new WriteToFile();
        
        
        
        String[] purchases = reader.read();
        splitter.split(" ",purchases);
        
        Calculator calculations= new Calculator(splitter.getStores(),splitter.getPrices());
                
        String res= report.createReport(calculations, mexForm);
        //String res= report.createReport(calculations, japForm);
        
       
        writer.write(res);
        
    }
    
}
