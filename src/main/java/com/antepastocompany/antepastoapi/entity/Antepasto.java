package com.antepastocompany.antepastoapi.entity;

import com.antepastocompany.antepastoapi.enums.Spicy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Antepasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String flavor;

    @Enumerated(EnumType.STRING)
    @Column
    private Spicy spicy;

    @Column
    private int quantity;

    @Column
    private double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Spicy getSpicy() {
        return spicy;
    }

    public void setSpicy(Spicy spicy) {
        this.spicy = spicy;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
