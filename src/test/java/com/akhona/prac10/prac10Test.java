/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akhona.prac10;

import akhona.studprac.config.config10;
import akhona.studprac.service.prac10;
import static com.akhona.prac10.prac10Test.prac10;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author davinci
 */
public class prac10Test {
    public static prac10 prac10;
    public prac10Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        Assert.assertTrue(prac10.getCon(5),"a true is expected!" );
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(config10.class);
        prac10 = (prac10)ctx.getBean("box");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
