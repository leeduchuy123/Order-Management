package com.myproject.Order.Management.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data           // Tự động tạo getter, setter, equals, hashCode, toString
@Entity         // Đánh dấu đây là một bảng trong database
@AllArgsConstructor  // Tạo constructor với tất cả tham số
@NoArgsConstructor   // Tạo constructor không tham số
@Builder        // Cho phép tạo đối tượng theo kiểu Builder pattern
@Table(name = "products")  // Đặt tên bảng trong database là "products"
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required! Please, input the product's name")
    private String name;

    @Column(unique = true)
    @NotBlank(message = "SKU is required") //stoke keeping unit (cai, qua, chiec)
    private String sku;

    @Positive(message = "product's price must be > 0")
    private BigDecimal price;

    @Min(value=0, message="stock quanity cannot be negative")
    private Integer stockQuantity;

    private String description;

    private LocalDateTime expiryDate;

    private String imageUrl;

    private final LocalDateTime createAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "category_id") //Tên cột khóa ngoại
    private Category category;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", description='" + description + '\'' +
                ", expiryDate=" + expiryDate +
                ", imageUrl='" + imageUrl + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
