package com.antepastocompany.antepastoapi.entity;

import com.antepastocompany.antepastoapi.enums.AntepastoFlavor;
import com.antepastocompany.antepastoapi.enums.Spicy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Antepasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AntepastoFlavor flavor;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Spicy spicy;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private Double price;

}
