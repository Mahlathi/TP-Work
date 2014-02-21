/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akhona.prac3;

import akhona.studprac.config.config;
import akhona.studprac.config.config3;
import akhona.studprac.service.prac3;
import static com.akhona.prac2.prac2Test.prac2;
import static com.akhona.prac3.prac3Test.prac3;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class prac3Test {
    public static prac3 prac3;
    public prac3Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        Assert.assertEquals(false, prac3.myFalse());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(config3.class);
        prac3 = (prac3)ctx.getBean("myF");
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
