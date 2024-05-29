package com.bmsoft.soft_matenimineto_equipos.Service;

import com.bmsoft.soft_matenimineto_equipos.model.entity.Marca;

import java.util.Optional;

public interface IMarca {

    Marca save (Marca marca);
    void delete (Integer id);
    Marca update (Integer id, Marca newMarca);
    Optional<Marca> findById(Integer id);
    Iterable<Marca> findAll ();
}
