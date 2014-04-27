/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akhona.hotelweb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author davinci
 */
@Entity
public class Bookings implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String guestName;
    
    private Bookings()
    {}
    
    private Bookings( Builder builder )
    {
        id = builder.id;
        guestName = builder.guestName;
    }
    
    public static class Builder
    {
        private Long id;
        private String guestName;
        
        public Builder( String guestName )
        {
            this.guestName = guestName;
        }
        
        public Builder id( Long value )
        {
            id = value;
            return this;
        }
        
        public Bookings build()
        {
            return new Bookings(this);
        }
    }

    public Long getId() {
        return id;
    }
    
     public String getGuestName() {
        return guestName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookings)) {
            return false;
        }
        Bookings other = (Bookings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.Bookings[ id=" + id + " ]";
    }
    
}
