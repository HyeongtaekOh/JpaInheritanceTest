package com.example.demo.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("Q")
public class RequestNotice extends Notice{

    private String requestContent;
}
