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
public class Machines implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String maintainance;
    private String type;
    
    private Machines()
    {}
    
    private Machines( Builder builder )
    {
        id = builder.id;
        maintainance = builder.maintainance;
        type = builder.type;
    }
    
    public static class Builder
    {
        private String maintainance;
        private String type;
        private Long id;
        
        public Builder( String maintainance )
        {
            this.maintainance = maintainance;
        }
        
        public Builder type( String value )
        {
            type = value;
            return this;
        }
        
        public Builder id( Long value )
        {
            id = value;
            return this;
        }
        
        public Machines build()
        {
            return new Machines(this);
        }
    }

    public String getMaintainance() {
        return maintainance;
    }

    public String getType() {
        return type;
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
        if (!(object instanceof Machines)) {
            return false;
        }
        Machines other = (Machines) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.Machines[ id=" + id + " ]";
    }
    
}
