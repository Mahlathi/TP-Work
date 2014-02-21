/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.config;


import akhona.studprac.service.Imp.prac8Imp;
import akhona.studprac.service.prac8;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author davinci
 */
public class config8 {
@Bean(name = "bar")
    public prac8 getService()
    {
        return (prac8) new prac8Imp();
    }    
}
