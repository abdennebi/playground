package com.sfeir.qb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Abderrazak BOUADMA
 * on 02/05/2017.
 */
@Data
@AllArgsConstructor
@Builder
public class ProductWithStock {

    private String productRef;
    private String productTitle;
    private String productDescription;
    private Long quantity;
}
