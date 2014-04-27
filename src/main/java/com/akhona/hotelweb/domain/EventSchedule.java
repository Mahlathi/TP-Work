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
public class EventSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private String venue;
    private List<Guest> guests;

    
    

    private EventSchedule()
    {}
    
    private EventSchedule( Builder builder )
    {
        id = builder.id;
        type = builder.type;
        venue = builder.venue;
        guests = builder.guests;
    }
    
    public static class Builder
    {
        private String type;
        private String venue;
        private List<Guest> guests;
        private Long id;
        
        public Builder( String venue )
        {
            this.venue = venue;
        }
        
        public Builder type( String value )
        {
            type = value;
            return this;
        }
        
        public Builder guests( List<Guest> values )
        {
            guests = values;
            return this;
        }
        
        public Builder id( Long value )
        {
            id = value;
            return this;
        }
        
        public EventSchedule build()
        {
            return new EventSchedule(this);
        }
        
    }
    
    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getVenue() {
        return venue;
    }

    public List<Guest> getGuests() {
        return guests;
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
        if (!(object instanceof EventSchedule)) {
            return false;
        }
        EventSchedule other = (EventSchedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.EventSchedule[ id=" + id + " ]";
    }
    
}
