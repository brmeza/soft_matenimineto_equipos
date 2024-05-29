package com.bmsoft.soft_matenimineto_equipos.model.dao;

import com.bmsoft.soft_matenimineto_equipos.model.entity.Equipo;
import org.springframework.data.repository.CrudRepository;


public interface IEquipoDao extends CrudRepository<Equipo, Integer> {
}
