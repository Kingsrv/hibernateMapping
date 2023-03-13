package com.hibernate.oneToOne.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private int id;
    private String name;
    private int rollNumber;


    /*
    if we only write oneToOne in student class only then this is unidirectional mapping which means if we
    get a laptop object then we cannot find the student.
    Now to make it bidirectional we should do the same in laptop class as well.
     */

    /*
    when we write the oneToOne annotation in both the tables then mysql created foreign key in both the tables
    to ensure the bidirectional functionality,
    These are logs from springBoot Application Run :-
    Hibernate: create table student (id integer not null, name varchar(255), roll_number integer not null, laptop_id integer, primary key (id)) engine=InnoDB
    Hibernate: alter table laptop add constraint FKo751tqg9s5amnjjyo10t9hma1 foreign key (student_id) references student (id)
    Hibernate: alter table student add constraint FKaln8iou1flq4b062un8ue4tw7 foreign key (laptop_id) references laptop (id)
     */

    // we can manage bidirectional mapping using one relation.

    /*
    The below mapped by type of oneToOne ensures that only laptop table gets a foreign key of student,
    but there is still an issue, if we create a laptop it will not create a student,
    to overcome this we should use the CASCADE feature.
     */

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    @JsonBackReference
    private Laptop laptop;

}
