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
public interface Format {
    public abstract DecimalFormat getCurrencyFormat();
    
    public abstract SimpleDateFormat getDateFormat();
}
