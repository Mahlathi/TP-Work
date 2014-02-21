/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.config;


import akhona.studprac.service.Imp.prac5Imp;
import akhona.studprac.service.prac5;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author davinci
 */
public class config5 {
    @Bean(name = "myInts")
    public prac5 getService()
    {
        return new prac5Imp();
    }
}
