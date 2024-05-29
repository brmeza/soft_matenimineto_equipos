package com.bmsoft.soft_matenimineto_equipos.Service;

import com.bmsoft.soft_matenimineto_equipos.model.entity.Equipo;

import java.util.List;
import java.util.Optional;


public interface IEquipo {


    Equipo save (Equipo equipo);
    void delete (Integer id);
    Equipo update(Integer id, Equipo newEquipo);
    Optional<Equipo> findById(Integer id);
    Iterable<Equipo> findAll();

}
