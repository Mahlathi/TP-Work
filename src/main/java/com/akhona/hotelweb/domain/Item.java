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
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String roomType;
    private String item;
    
    private Item()
    {}
    
    private Item( Builder builder )
    {
        id = builder.id;
        roomType = builder.roomType;
        item = builder.item;
    }
    
    public static class Builder
    {
        private Long id;
        private String roomType;
        private String item;  
    
        public Builder( String item )
        {
            this.item = item;
        }
        
        public Builder roomType( String value )
        {
            roomType = value;
            return this;
        }
        
        public Builder id( Long value )
        {
            id = value;
            return this;
        }
        
        public Item build()
        {
            return new Item(this);
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public String getItem() {
        return item;
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
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.Item[ id=" + id + " ]";
    }
    
}
