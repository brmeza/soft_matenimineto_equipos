package com.bmsoft.soft_matenimineto_equipos.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mantenimientos")
public class Mantenimineto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipoMantenimineto;//preventivo o correctivo
    private String problema;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;

    //llaves
    @OneToOne
    @JoinColumn(name = "id_monitor", nullable = false)
    private Monitor monitor;
    @OneToOne
    @JoinColumn(name="id_equipo", nullable = false)
    private  Equipo equipo;


}
