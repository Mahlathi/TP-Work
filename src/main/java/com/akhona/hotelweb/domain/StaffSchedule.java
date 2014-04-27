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
public class StaffSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private List<Staff> list;
    private String time;
    private String date;
    
    private StaffSchedule()
    {}
    
    private StaffSchedule( Builder builder )
    {
        id = builder.id;
        list = builder.list;
        time = builder.time;
        date = builder.date;
    }
    
    public static class Builder
    {
        private List<Staff> list;
        private String time;
        private String date;
        private Long id;
        
        public Builder( String date )
        {
            this.date = date;
        }
        
        public Builder list( List<Staff> value)
        {
            list = value;
            return this;
        }
        
        public Builder time( String value )
        {
            time = value;
            return this;
        }
        
        public Builder id( Long value )
        {
            id = value;
            return this;
        }
        
        public StaffSchedule build()
        {
            return new StaffSchedule(this);
        }
        
        
    }

    public List<Staff> getList() {
        return list;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
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
        if (!(object instanceof StaffSchedule)) {
            return false;
        }
        StaffSchedule other = (StaffSchedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.StaffSchedule[ id=" + id + " ]";
    }
    
}
