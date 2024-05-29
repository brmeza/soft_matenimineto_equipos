package com.bmsoft.soft_matenimineto_equipos.model.dto;

import lombok.Data;

@Data
public class EquipoDto {


    private Integer id;
    private String tipo;
    private String codigo;
    private String fechaIngreso;
    private String estado;

    private MarcaDto marca;
    private SalaDto sala;


}
