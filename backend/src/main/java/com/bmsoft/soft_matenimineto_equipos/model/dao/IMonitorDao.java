package com.bmsoft.soft_matenimineto_equipos.model.dao;

import com.bmsoft.soft_matenimineto_equipos.model.entity.Monitor;
import org.springframework.data.repository.CrudRepository;

public interface IMonitorDao extends CrudRepository<Monitor,Integer> {
    boolean existsByNombre(String nombre);
}
