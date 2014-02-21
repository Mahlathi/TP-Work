/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.service.Imp;

import akhona.studprac.service.prac8;

/**
 *
 * @author davinci
 */
public class prac8Imp implements prac8{
    public float quax = (float) 1.5;
    @Override
    public float myFloats(int baz) {
       return ( quax + baz );
    }
    
}
