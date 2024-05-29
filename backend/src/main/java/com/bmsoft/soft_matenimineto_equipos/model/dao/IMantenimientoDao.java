package com.bmsoft.soft_matenimineto_equipos.model.dao;

import com.bmsoft.soft_matenimineto_equipos.model.entity.Mantenimineto;
import org.springframework.data.repository.CrudRepository;

public interface IMantenimientoDao extends CrudRepository<Mantenimineto, Integer> {
}
