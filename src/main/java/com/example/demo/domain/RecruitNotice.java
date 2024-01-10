package com.example.demo.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("R")
public class RecruitNotice extends Notice {

    private int recruitNumber;
    private String recruitContent;
}
