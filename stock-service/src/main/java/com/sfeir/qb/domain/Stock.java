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
 * on 02/05/2017.
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productRef;

    private Long quantity;
}
