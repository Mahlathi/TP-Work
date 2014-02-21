/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.config;

import akhona.studprac.service.Imp.prac4Imp;
import akhona.studprac.service.prac4;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author davinci
 */
public class config4 {
    @Bean(name = "myNulls")
    public prac4 getService()
    {
        return new prac4Imp();
    }
}
