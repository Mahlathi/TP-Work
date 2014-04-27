/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akhona.hotelweb.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author davinci
 */
@Embeddable
public class Bill implements Serializable{
    
    private int guestId;
    private double amount;
    
    public int getGuestId() {
        return guestId;
    }

    public double getAmount() {
        return amount;
    }
    
    public void setGuestId( int guestId ) {
        this.guestId = guestId;
    }

    public void setAmount( double amount ) {
        this.amount = amount;
    }
}
