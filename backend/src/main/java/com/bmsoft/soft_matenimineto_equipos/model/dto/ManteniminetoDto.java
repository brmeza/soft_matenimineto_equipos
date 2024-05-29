package com.bmsoft.soft_matenimineto_equipos.model.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class ManteniminetoDto {

    private Integer id;
    private String tipoMantenimineto;
    private String problema;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;


    private MonitorDto monitor;
    private EquipoDto equipo;


}
