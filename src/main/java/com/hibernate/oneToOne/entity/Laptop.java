package com.hibernate.oneToOne.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "laptop")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {

    @Id
    private int id;
    private String modelName;
    private String modelNumber;

    /*
    we are considering student as the parent class here because there will be no foreign key of laptop in
    student table, thus we have to annotate the student in the child class with @JsonManagedReference
    and the laptop in the parent class with @JsonBackedReference which will prevent the infinite loop
    while post and get calls.
     */

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Student student;

}
