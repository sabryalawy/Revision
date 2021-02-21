/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revition;

import revition.JavaConsept.*;

/**
 *
 * @author Alawi
 */
public class Revition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //java 
        //  en,iner,polemor,interfa, abstract
        //data structer
        //link list,tree,O(time)
        User user1 = new User(0, "SAbry", "0595911611");
        User user2 = new User(1, "mohammad", "0568335652");
        User user3 = new Customer("darJrir", "safsdg", 3, "mazen", "059964475sfd4");
        String[] user4orders = new String[5];
        user4orders[0] = "7maam";
        user4orders[1] = "7maam";
        user4orders[2] = "7maam";
        User user4 = new Professional("Najaar", user4orders, 4, "naeem", "0599644754");
        UserIn user5 = new Customer("kofor malk", "asdasd", 5, "asdasd", "asdasdasd");

        UserIn user6 = new Professional("Najaar", user4orders, 4, "naeem", "0599644754");

        User[] users = new User[6];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        users[4] = (User) user5;
        users[5] = (User) user6;

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].toString());

        }
    }

}
