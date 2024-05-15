package com.example.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    @NotBlank(message = "First name is required")
    @Column(name = "customer_first_name", nullable = false)
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Column(name = "customer_last_name", nullable = false)
    private String lastName;

    @NotBlank(message = "Postal code is required")
    @Size(min = 5, max = 10, message = "Postal code must be between 5 and 10 characters")
    @Column(name = "postal_code", nullable = false)
    private String postal_code;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "\\(\\d{3}\\)\\d{3}-\\d{4}", message = "Phone number must be in the format (555)555-5555")
    @Column(name = "phone", nullable = false)
    private String phone;

    @NotBlank(message = "Address is required")
    @Column(name = "address", nullable = false)
    private String address;

    @CreationTimestamp
    @Column(name = "create_date")
    private Date createDate;

    @UpdateTimestamp
    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Cart> carts;

    @NotNull(message = "Division is required")
    @ManyToOne
    @JoinColumn(name = "division_id", nullable = false)
    private Division division;

    public void add(Cart cart) {
        this.carts.add(cart);
    }
}
