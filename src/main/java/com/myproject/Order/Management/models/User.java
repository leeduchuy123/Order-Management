package com.myproject.Order.Management.models;

import com.myproject.Order.Management.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Name is required! Please, input your fullname")
    private String name;

    @NotBlank(message = "Email is required! Please, input your email")
    @Column(unique = true)
    private String email;

    @NotBlank(message = "Password is required! Please, input your password")
    private String password;

    @NotBlank(message = "Phone number is required! Please, input your phone number")
    @Column(name = "phone_number")
    private String phoneNumber;
    private UserRole role;

    @Column(name = "create_at")
    private final LocalDateTime createAt = LocalDateTime.now();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Transaction> transactions = new ArrayList<>();

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role=" + role +
                ", createAt=" + createAt +
                '}';
    }
}
