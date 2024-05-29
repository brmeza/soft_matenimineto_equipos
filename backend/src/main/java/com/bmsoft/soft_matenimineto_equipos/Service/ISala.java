package com.bmsoft.soft_matenimineto_equipos.Service;

import com.bmsoft.soft_matenimineto_equipos.model.dto.SalaDto;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Sala;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Sede;

import java.util.Optional;

public interface ISala {

    Sala save (Sala sala);
    void delete (Integer id);
    Sala update (Integer id, Sala sala);
    Iterable<Sala> findAll();
    Optional<Sala> findById(Integer id);



}
