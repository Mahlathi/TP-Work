/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.config;

import akhona.studprac.service.Imp.prac2Imp;
import akhona.studprac.service.prac2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author davinci
 */
@Configuration
public class config2 {
    @Bean(name = "myT")
    public prac2 getService()
    {
        return new prac2Imp();
    }
}
