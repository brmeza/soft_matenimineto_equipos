package com.bmsoft.soft_matenimineto_equipos.Service;

import com.bmsoft.soft_matenimineto_equipos.model.entity.Monitor;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Sede;

import java.util.Optional;

public interface IMonitor {

    Monitor save (Monitor monitor);
    void delete (Integer id);
    Monitor update (Integer id, Monitor newMonitor);
    Iterable<Monitor> findAll();
    Optional<Monitor> findById(Integer id);

}
