/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.config;

import akhona.studprac.service.Imp.prac3Imp;
import akhona.studprac.service.prac3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author davinci
 */
@Configuration
public class config3 {
    @Bean(name = "myF")
    public prac3 getService()
    {
        return new prac3Imp();
    }
}
