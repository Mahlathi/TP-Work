/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.service.Imp;

import akhona.studprac.service.prac1;
import java.util.*;
/**
 *
 * @author davinci
 */
public class prac1Imp implements prac1{

        

    @Override
    public String myDays(String myDays) {
        Map<String, String> myMap = new HashMap<String, String>();
        String result = "";
        
        myMap.put("1", "Monday");
        myMap.put("2", "Tuesday");
        myMap.put("3", "Wednesday");
        myMap.put("4", "Thursday");
        myMap.put("5", "Friday");
        myMap.put("6", "Saturday");
        myMap.put("7", "Sunday");
        
        if( myMap.containsKey( myDays ))
        {
            result = myMap.get(myDays);
        }
        return result;
    }
    
}
