/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.config;

import akhona.studprac.service.Imp.prac1Imp;
import akhona.studprac.service.prac1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author davinci
 */
@Configuration
public class config {
    @Bean(name = "days")
    public prac1 getService(){
        return new prac1Imp();
    }
}
