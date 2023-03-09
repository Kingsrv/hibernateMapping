package com.hibernate.oneToOne.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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

    @OneToOne
    private Student student;

    private String sId;

}
