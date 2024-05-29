package com.bmsoft.soft_matenimineto_equipos.Service.impl;

import com.bmsoft.soft_matenimineto_equipos.Service.IMonitor;
import com.bmsoft.soft_matenimineto_equipos.model.dao.IMonitorDao;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Monitor;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Sede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MonitorImp implements IMonitor {

    @Autowired
    private IMonitorDao monitorDao;


    @Override
    public Monitor save(Monitor monitor) {
        if (monitorDao.existsByNombre(monitor.getNombre())){
            throw new IllegalArgumentException("el monitor ya existe");
        }
        return monitorDao.save(monitor);
    }

    @Override
    public void delete(Integer id) {
        monitorDao.deleteById(id);
    }

    @Override
    public Monitor update (Integer id,Monitor newMonitor){
        Optional<Monitor> monitor = monitorDao.findById(id);
        newMonitor.setId(monitor.get().getId());
        return monitorDao.save(newMonitor);
    }

    @Override
    public Iterable<Monitor> findAll() {
        return monitorDao.findAll();
    }

    @Override
    public Optional<Monitor> findById(Integer id) {
        return monitorDao.findById(id);
    }
}
