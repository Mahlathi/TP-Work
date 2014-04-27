/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akhona.hotelweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embeddable;

/**
 *
 * @author davinci
 */
@Embeddable
public class EventBooking implements Serializable{
    
    private String event;
    private String date;
    private List<Guest> guests;

    public String getEvent() {
        return event;
    }

    public String getDate() {
        return date;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
    
    
    
}
