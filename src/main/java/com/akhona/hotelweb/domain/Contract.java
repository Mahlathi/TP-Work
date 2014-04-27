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
public class Contract implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int duration;
    
    private Contract()
    {}
    
    private Contract( Builder builder )
    {
        duration = builder.duration;
        id = builder.id;
    }
    
    public static class Builder
    {
       private int duration;
       private Long id;
       
       public Builder( int duration )
       {
           this.duration = duration;
       }
       
       public Builder id( Long value )
       {
           id = value;
           return this;
       }
       
       public Contract build()
       {
           return new Contract(this);
       }
    }

    public int getDuration() {
        return duration;
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
        if (!(object instanceof Contract)) {
            return false;
        }
        Contract other = (Contract) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.Contract[ id=" + id + " ]";
    }
    
}
