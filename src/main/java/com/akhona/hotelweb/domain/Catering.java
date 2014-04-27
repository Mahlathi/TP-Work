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
public class Catering implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int roomNumber;
    private String order;
    
    private Catering()
    {}
    
    private Catering( Builder builder )
    {
        id = builder.id;
        order = builder.order;
        roomNumber = builder.roomNumber;
    }
    
    public static class Builder
    {
        private int roomNumber;
        private String order; 
        private Long id;
        
        public Builder( String order )
        {
            this.order = order;
        }
        
        public Builder roomNumber( int value )
        {
            roomNumber = value;
            return this;
        }
        
        public Builder id( Long value )
        {
            id = value;
            return this;
        }
        
        public Catering build()
        {
            return new Catering(this);
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getOrder() {
        return order;
    }

    
    public Long getId() {
        return id;
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
        if (!(object instanceof Catering)) {
            return false;
        }
        Catering other = (Catering) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.Catering[ id=" + id + " ]";
    }
    
}
