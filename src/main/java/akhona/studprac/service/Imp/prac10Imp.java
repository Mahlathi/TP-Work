/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.service.Imp;

import akhona.studprac.service.prac10;

/**
 *
 * @author davinci
 */
public class prac10Imp implements prac10{
public int y = 0;
public boolean stat = false;
    @Override
    public boolean getCon(int x) {
        if( x > y)
        {
            stat =true;
        }
        return stat;
    }
    
}
