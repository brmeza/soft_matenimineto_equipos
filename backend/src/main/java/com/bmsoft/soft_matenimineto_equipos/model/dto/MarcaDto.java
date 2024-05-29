package com.bmsoft.soft_matenimineto_equipos.model.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class MarcaDto {

    private Integer id;
    private String nombreMarca;

}
