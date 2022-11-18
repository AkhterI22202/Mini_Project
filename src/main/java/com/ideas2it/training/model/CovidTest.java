package com.ideas2it.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CovidTest {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String specimentype;
    private String testPrinciples;
    private boolean testPositive;

}
