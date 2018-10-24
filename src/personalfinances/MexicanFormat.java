/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinances;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author skullgsus
 */
public class MexicanFormat implements Format{

    @Override
    public DecimalFormat getCurrencyFormat() {
        DecimalFormat currencyFormat = new DecimalFormat("$0.00");
        return(currencyFormat);
    }

    @Override
    public SimpleDateFormat getDateFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return(dateFormat);
    }
    
}
