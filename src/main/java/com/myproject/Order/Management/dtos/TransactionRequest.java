package com.myproject.Order.Management.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionRequest {
    @Positive(message = "product id must be required")
    private Long productId;

    @Positive(message = "quantity must be > 0")
    private Integer quantity;

    private Long supplierId;

    private String description;

    private String note;
}
