/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
public class HelloModel {
    private Map<String, String> messages;    
    public HelloModel() {
        messages = new HashMap<String, String>();
        messages.put("John", "Hello");
        messages.put("Ray", "Welcome");
        messages.put("Vincent", "Hi");
    }
    public String sayHello(String user) {
        String message = messages.get(user);
        return message + ", " + user + "!";
    }
}

