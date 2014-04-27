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
public class Activities implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int ageLimit;
    private String type;
    private String date;
    private String time;
    private String venue;
    
    private Activities()
    {}
    
    private Activities( Builder builder )
    {
        id = builder.id;
        ageLimit = builder.ageLimit;
        type = builder.type;
        date = builder.date;
        time = builder.time;
        venue = builder.venue;
    }
    
    public static class Builder
    {
        
        private int ageLimit;
        private String type;
        private String date;
        private String time;
        private String venue;
        private Long id;
        
        public Builder( String type )
        {
            this.type = type;
        }
        
        public Builder ageLimit( int value )
        {
            ageLimit = value;
            return this;
        }
        
        public Builder date( String value )
        {
            date = value;
            return this;
        }
        
        public Builder time( String value )
        {
            time = value;
            return this;
        }
        
        public Builder venue( String value )
        {
            venue = value;
            return this;
        }
        
        public Builder id( Long value )
        {
             id = value;
             return this;
        }
        
        public Activities build()
        {
            return new Activities(this);
        }

       
    }

     public int getAgeLimit() {
        return ageLimit;
    }
     
    public String getType() {
        return type;
    }
    
    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getVenue() {
        return venue;
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
        if (!(object instanceof Activities)) {
            return false;
        }
        Activities other = (Activities) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.Activities[ id=" + id + " ]";
    }
    
}
