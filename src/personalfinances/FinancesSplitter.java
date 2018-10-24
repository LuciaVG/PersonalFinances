/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinances;

/**
 *
 * @author bvlul
 */
public class FinancesSplitter {
    
        private String[] stores;
        private Double[] prices;
    
    public FinancesSplitter(){

        stores = new String[0];
        prices = new Double[0];
   
    }
    
    public void Split(String delimeter, String[] rawLines){
        
        int len = rawLines.length;
        
        stores = new String[len];
        prices = new Double[len];
        
        String[] lineParts;
        
        for(int i = 0; i < len ; i++){
            
            lineParts = rawLines[i].split(delimeter);
            
            stores[i] = lineParts[0];
            prices[i] = Double.parseDouble(lineParts[1]);
            
        }
    }
            
    public String[] getStores(){
        return stores;
    }

    public Double[] getPrices(){
        return prices;
    }
    
}
