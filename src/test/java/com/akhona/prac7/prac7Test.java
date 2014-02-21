/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akhona.prac7;

import akhona.studprac.config.config7;
import akhona.studprac.service.prac7;
import static com.akhona.prac7.prac7Test.prac7;
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
public class prac7Test {
    public static prac7 prac7;
    public prac7Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void myThing() throws Exception {
        Assert.assertEquals(prac7.numbr(), 9);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(config7.class);
        prac7 = (prac7)ctx.getBean("foo");
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
