package com.antepastocompany.antepastoapi.dto.request;

import com.antepastocompany.antepastoapi.enums.AntepastoFlavor;
import com.antepastocompany.antepastoapi.enums.Spicy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AntepastoDTO {

    private Long id;

    @NotEmpty
    private AntepastoFlavor flavor;

    @NotEmpty
    private Spicy spicy;

    @NotEmpty
    private int quantity;

    @NotEmpty
    private Double price;
}
