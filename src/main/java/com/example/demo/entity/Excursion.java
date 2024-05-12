package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "excursions")
@Getter
@Setter
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "excursion_price")
    private BigDecimal excursionPrice;

    @Column(name = "excursion_title")
    @JsonProperty("excursion_title")
    private String excursionTitle;

    @Column(name = "image_url")
    @JsonProperty("image_URL")
    private String imageURL;

    @Column(name = "last_update")
    private Date lastUpdate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "excursions", fetch = FetchType.LAZY)
    private Set<CartItem> cartItems;
}
