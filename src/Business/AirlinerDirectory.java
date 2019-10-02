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
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airlinerDirec;
    private CustomerDirectory customerDirectory;
    
    public AirlinerDirectory(){
        airlinerDirec = new ArrayList<>();
        customerDirectory = new CustomerDirectory();
    
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    
    public ArrayList<Airliner> getAirlinerDirec() {
        return airlinerDirec;
    }
    
    public Airliner addAirliner(){
        Airliner air = new Airliner();
        airlinerDirec.add(air);
        return air;
    
    }
    
    public void removeAirliner(Airliner air){
        airlinerDirec.remove(air);
    }
    
}
