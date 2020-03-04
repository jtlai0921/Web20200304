/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
public class UserModel {
    Map<String,String>  data=new HashMap<>();
    public UserModel(){
        data.put("Amy", "a123");
        data.put("Bob", "b123");
        data.put("Rose", "r123");
    }
    public boolean check(String n,String p){
        String pass=data.get(n);
        if(pass==null)
            return false;
        if(p.equals(pass))
            return true;
        else
            return false;
    }
}
