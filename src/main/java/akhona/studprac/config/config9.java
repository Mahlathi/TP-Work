/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.config;

import akhona.studprac.service.Imp.prac9Imp;
import akhona.studprac.service.prac9;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author davinci
 */
public class config9 {
    @Bean(name = "quax")
    public prac9 getService()
    {
        return (prac9) new prac9Imp();
    }    
}
