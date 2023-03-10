package com.hibernate.manyToMany.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "jpa_product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    private String pId;
    private String productName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Category> categoryList;
}
