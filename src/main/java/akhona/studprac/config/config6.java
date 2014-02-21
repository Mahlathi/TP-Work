/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.studprac.config;


import akhona.studprac.service.Imp.prac6Imp;

import akhona.studprac.service.prac6;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author davinci
 */
public class config6 {
    @Bean(name = "toys")
    public prac6Imp getService()
    {
        return new prac6Imp();
    }
}
