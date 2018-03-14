/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funix.db;

import com.funix.model.UserInfor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author hung
 */
public class MapData {

    private Map<String, String> map = new HashMap<>();

    private static MapData instance = null;

    private MapData() {
    }

    public static MapData getInstance() {
        if (instance == null) {
            instance = new MapData();
        }
        return instance;
    }

    //Add user vao map
    public void addUser(UserInfor userInfor) {
        if (userInfor != null) {
            map.put(userInfor.getUserName(), userInfor.getPassWord());

        }
    }

    public boolean doLogin(UserInfor user) {
        Set set = map.entrySet();
        Iterator i = set.iterator();
        boolean flag = false;
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            if (user.getUserName().equals(me.getKey()) && user.getPassWord().equals(me.getValue())) {
                flag = true;
                break;
            }
        }
        return flag;
    }

   

    public boolean isExistUser(String userName) {
        Set<String> keySet = map.keySet();
        for (String i : keySet) {
            if (userName.equals(i)) {
                return true;
            }
            break;
        }
        return false;
    }

}
