package com.scm.microservices.order.dto;

public record OrderRequest(Long id,String orderNumber,String skuCode,
                            BigDecimal  price, Integer quantity) {

}
