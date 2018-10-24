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
public class Calculator {
    String[] stores;
    Double[] expenses;
    
    public Calculator(String[] stores,Double[] expenses){
        this.stores=stores;
        this.expenses=expenses;
    }
    
    public int getMin(){
		int res=expenses[0];
		for(int i=0;i<expenses.length();i++){
			if (res>expenses[i]){
				res=expenses[i];
			}
		}
        return (res);
    }
    
    public int getMax(){
        int res=expenses[0];
		for(int i=0;i<expenses.length();i++){
			if (res<expenses[i]){
				res=expenses[i];
			}
		}
        return (res);
    }
    
    public int getAverage(){
       	int sum=0;
		for(int i=0;i<expenses.length();i++){
			sum+=expenses[i];
		}
		int res=sum/expenses.length();
        return (res);
    }
    
}
