package com.bmsoft.soft_matenimineto_equipos.model.dao;

import com.bmsoft.soft_matenimineto_equipos.model.entity.Sede;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ISedeDao extends CrudRepository<Sede, Integer> {
    boolean existsByNombreSede(String nombre);
}
