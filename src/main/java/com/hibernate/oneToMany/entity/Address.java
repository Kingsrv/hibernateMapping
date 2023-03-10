package com.hibernate.oneToMany.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hibernate.oneToOne.entity.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    private int id;
    private String street;
    private String city;
    private long zipCode;
    private String country;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private StudentManyToOne student;
}
