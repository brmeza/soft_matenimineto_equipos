package com.bmsoft.soft_matenimineto_equipos.model.dao;

import com.bmsoft.soft_matenimineto_equipos.model.entity.Marca;
import org.springframework.data.repository.CrudRepository;

public interface IMarcaDao extends CrudRepository<Marca,Integer> {
    boolean existsByNombreMarca(String nombre);
}
