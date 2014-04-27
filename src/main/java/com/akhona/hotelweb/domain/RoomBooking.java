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
public class RoomBooking implements Serializable{
    
    private String roomType;
    private String guestId;
    private List<Guest> guests;

    public String getRoomType() {
        return roomType;
    }

    public String getGuestId() {
        return guestId;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
    
    
}
