/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.config;

import akhona.studprac.service.Imp.prac10Imp;
import akhona.studprac.service.prac10;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author davinci
 */
public class config10 {
    @Bean(name = "box")
    public prac10 getService()
    {
        return (prac10) new prac10Imp();
    }
}
