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
public class Cleaning implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String time;
    
    private Cleaning()
    {}
    
    private Cleaning( Builder builder )
    {
        id = builder.id;
        time = builder.time;
    }
    
    public static class Builder
    {
        private String time;
        private Long id;
        
        public Builder( String time )
        {
            this.time = time;
        }
        
        public Builder staffId( Long value )
        {
            id = value;
            return this;
        }
        
        public Cleaning build()
        {
            return new Cleaning(this);
        }
    }

    public String getTime() {
        return time;
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
        if (!(object instanceof Cleaning)) {
            return false;
        }
        Cleaning other = (Cleaning) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.Cleaning[ id=" + id + " ]";
    }
    
}
