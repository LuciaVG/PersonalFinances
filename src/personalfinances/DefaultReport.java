/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinances;

import java.util.Date;

/**
 *
 * @author skullgsus
 */
public class DefaultReport implements Report{

    @Override
    public String createReport(Calculator calculations, Format format) {
        String report="purchases of ";
        report+=format.getDateFormat().format(new Date());
        report+="\n";
        report+="Min: "+format.getCurrencyFormat().format(calculations.getMin())+"\n";
        report+="Max: "+format.getCurrencyFormat().format(calculations.getMax())+"\n";
        report+="Average: "+format.getCurrencyFormat().format(calculations.getAverage())+"\n";
        return report;
    }
    
}
