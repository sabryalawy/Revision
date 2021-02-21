/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revition.JavaConsept;

/**
 *
 * @author Alawi
 */
public class Professional extends User implements UserIn{
    private String professtion;
    private String[] orders;

    public Professional(String professtion, String[] orders, int id, String name, String phoneNum) {
        super(id, name, phoneNum);
        this.professtion = professtion;
        this.orders = orders;
    }

    public String getProfesstion() {
        return professtion;
    }

    public void setProfesstion(String professtion) {
        this.professtion = professtion;
    }

    public String[] getOrders() {
        return orders;
    }

    public void setOrders(String[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        String rez = "";
        rez+=professtion;
        
        for (int i = 0; i < getOrders().length; i++) {
            rez+="/// "+orders[i];
            
        }
        
        return super.toString()+" //"+rez;
    }

    @Override
    public boolean isCostomer() {
        return false;
    }
    
    
    
}
