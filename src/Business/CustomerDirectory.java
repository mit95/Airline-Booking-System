/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mitka
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory(){
        customerDirectory = new ArrayList<>();
    
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }
    
   public Customer addCustomer(){
       Customer cust = new Customer();
       customerDirectory.add(cust);
       return cust;
   } 
   
   public void removeCustomer(Customer cust){
       customerDirectory.remove(cust);
   
   }
}
