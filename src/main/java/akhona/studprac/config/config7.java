/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.config;

import akhona.studprac.service.Imp.prac7Imp;
import akhona.studprac.service.prac7;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author davinci
 */
public class config7 {
    @Bean(name = "foo")
    public prac7 getService()
    {
        return (prac7) new prac7Imp();
    }
}
