/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akhona.prac2;

import akhona.studprac.config.config;
import akhona.studprac.config.config2;
import akhona.studprac.service.prac1;
import akhona.studprac.service.prac2;
import static com.akhona.prac2.prac2Test.prac2;
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
public class prac2Test {
    public static prac2 prac2;
    public prac2Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void myTruth() {
        Assert.assertEquals(true, prac2.myTruth());
    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(config2.class);
        prac2 = (prac2)ctx.getBean("myT");
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
