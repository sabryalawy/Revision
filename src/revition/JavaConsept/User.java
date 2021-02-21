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
public class User {
    private int id;
    private String name;
    private String phoneNum;

    public User(int id, String name, String phoneNum) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    

    @Override
    public String toString() {
        return "name = "+ getName() + "// phone number = "+getPhoneNum();
    }

    
    
    
}
