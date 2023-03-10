package com.hibernate.manyToMany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hibernate.manyToMany.entity.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "jpa_category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    private String cId;
    private String title;

    @ManyToMany(mappedBy = "categoryList",cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Product> productList;


}
