package com.sfeir.qb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Abderrazak BOUADMA
 * on 01/05/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ref;

    private String title;

    private String description;
}
