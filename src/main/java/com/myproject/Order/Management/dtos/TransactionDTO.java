package com.myproject.Order.Management.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.myproject.Order.Management.enums.TransactionStatus;
import com.myproject.Order.Management.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDTO {
    private Long id;

    private Integer totalProduct;

    private BigDecimal totalPrice;

    private TransactionType transactionType;

    private TransactionStatus transactionStatus;

    private String description;
    private String note;

    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    private UserDTO user;

    private ProductDTO product;

    private SupplierDTO supplier;
}
