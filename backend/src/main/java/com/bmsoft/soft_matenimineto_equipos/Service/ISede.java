package com.bmsoft.soft_matenimineto_equipos.Service;

import com.bmsoft.soft_matenimineto_equipos.model.dto.SedeDto;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Sede;

import java.util.Optional;

public interface ISede {

    Sede save (Sede sede);
    void delete (Integer id);
    Sede update (Integer id, Sede newSede);
    Iterable<Sede> findAll();
    Optional<Sede> findById(Integer id);
}
