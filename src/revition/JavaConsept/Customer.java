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
public class Customer extends User implements UserIn{
    
    private String location;
    private String eMail;

    public Customer(String location, String eMail, int id, String name, String phoneNum) {
        super(id, name, phoneNum);
        this.location = location;
        this.eMail = eMail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }



    @Override
    public String toString() {
        return super.toString()+"//location=" + location + "// eMail=" + eMail ;
    }

    @Override
    public boolean isCostomer() {
        return true;
    }
    
    
    
}
