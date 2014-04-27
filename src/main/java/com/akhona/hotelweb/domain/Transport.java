/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akhona.hotelweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author davinci
 */
@Entity
public class Transport implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private List<Staff> drivers;
    
    private Transport()
    {}
    
    private Transport( Builder builder )
    {
        id = builder.id;
        drivers = builder.drivers;
    }
    
    public static class Builder
    {
        private Long id;
        private List<Staff> drivers;
        
        public Builder ( List<Staff> values )
        {
            this.drivers = drivers;
            
        }
        
        public Builder id( Long value )
        {
            id = id;
            return this;
        }
        
        public Transport build()
        {
            return new Transport(this);
        }
    }

    public List<Staff> getDrivers() {
        return drivers;
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
        if (!(object instanceof Transport)) {
            return false;
        }
        Transport other = (Transport) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.Transport[ id=" + id + " ]";
    }
    
}
