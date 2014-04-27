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
public class Human implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private String surname;
    
    private Human()
    {}
    
    private Human( Builder builder )
    {
        id = builder.id;
        name = builder.name;
        age = builder.age;
        surname = builder.surname;
    }
    
    public static class Builder
    {
        private String name;
        private int age;
        private String surname;
        private Long id;
        
        public Builder( int age )
        {
            this.age = age;
        }
        
        public Builder name( String value )
        {
            name = value;
            return this;
        }
        
        public Builder surname( String value )
        {
            surname = value;
            return this;
        }
        
        public Builder id( Long value )
        {
            id = value;
            return this;
        }
        
        public Human build()
        {
            return new Human(this);
        }
    }

    public Long getId() {
        return id;
    }
    
     public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
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
        if (!(object instanceof Human)) {
            return false;
        }
        Human other = (Human) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.akhona.hotelweb.domain.Human[ id=" + id + " ]";
    }
    
}
