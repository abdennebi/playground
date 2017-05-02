package com.sfeir.qb.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Abderrazak BOUADMA
 * on 02/05/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    private Long id;
    private String ref;
    private String title;
    private String description;
}
