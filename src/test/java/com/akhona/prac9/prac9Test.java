/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akhona.prac9;

import akhona.studprac.config.config9;
import akhona.studprac.service.prac9;
import static com.akhona.prac9.prac9Test.prac9;
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
public class prac9Test {
    public static prac9 prac9;
    public prac9Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void myEquals() {
         Assert.assertNotEquals(prac9.myEquals("6"), prac9.myEquals2("9"));
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(config9.class);
       prac9 = (prac9)ctx.getBean("quax");
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
