package io.cloudnativestack.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ProductWithStock {

    private String productRef;
    private String productTitle;
    private String productDescription;
    private Long quantity;
}
