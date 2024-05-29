package com.bmsoft.soft_matenimineto_equipos.Service;

import com.bmsoft.soft_matenimineto_equipos.model.entity.Equipo;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Mantenimineto;

import java.util.Optional;

public interface IMantenimiento {

    Mantenimineto save (Mantenimineto mantenimineto);
    void delete (Integer id);
    Mantenimineto update (Integer id, Mantenimineto mantenimineto);
    Optional<Mantenimineto> findById (Integer id);
    Iterable<Mantenimineto> findAll();
}
