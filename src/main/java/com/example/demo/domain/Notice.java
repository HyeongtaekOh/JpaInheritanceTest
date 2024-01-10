package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "notice")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
public abstract class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id")
    private Long id;

    private String title;

    @Column(insertable = false, updatable = false)
    private String dtype;
}
