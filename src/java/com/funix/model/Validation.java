/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funix.model;

import java.util.regex.Pattern;

/**
 *
 * @author hung
 */
public class Validation {

    public boolean validateUserName(UserInfor user) {
        String userNamePattern1 = "\\w{6,}";
        String userNamePattern2 = "(?=.*[$#@%^&*])";
        String passwodPattern= "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+*=])(?=\\S+$).{8,}";


        return user.getUserName().matches(userNamePattern1) 
                && !user.getUserName().matches(userNamePattern2)
                && user.getPassWord().matches(passwodPattern);
    }

    public static void main(String[] args) {
        Validation v = new Validation();
        UserInfor user = new UserInfor("Myxaogion125", "Mai1983&");
        UserInfor user1 = new UserInfor("ww@!!!2", "Abd11z1");
        System.out.println(v.validateUserName(user));
        System.out.println(v.validateUserName(user1));

    }

}
