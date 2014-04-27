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
public class PayRoll implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double amount;
    private List<Staff> staff;
    
     private PayRoll()
    {}
    
    private PayRoll( Builder builder )
    {
        amount = builder.amount;
        id = builder.id;
        staff = builder.staff;
    }
    
    public static class Builder
    {
        private Long id;
        private double amount;
        private List<Staff> staff;
        
        public Builder( double amount )
        {
            this.amount = amount;
        }
        
        public Builder staffId( Long value )
        {
            id = value;
            return this;
        }
        
        public Builder staff( List<Staff> values )
        {
            staff = values;
            return this;
        }
        
        public PayRoll build()
        {
            return new PayRoll(this);
        }
    }

    public double getAmount() {
        return amount;
    }

    public List<Staff> getStaff() {
        return staff;
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
        if (!(object instanceof PayRoll)) {
            return false;
        }
        PayRoll other = (PayRoll) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.PayRoll[ id=" + id + " ]";
    }
    
}
