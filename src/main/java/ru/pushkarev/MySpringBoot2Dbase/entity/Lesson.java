package ru.pushkarev.MySpringBoot2Dbase.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "PUBLIC", name = "LESSONS")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "teacher")
    private String teacher;

    @Column(name = "description")
    private String description;

    @Column(name = "room")
    private Integer room;
}
