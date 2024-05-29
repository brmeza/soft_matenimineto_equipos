package com.bmsoft.soft_matenimineto_equipos.Service.impl;

import com.bmsoft.soft_matenimineto_equipos.Service.IEquipo;
import com.bmsoft.soft_matenimineto_equipos.model.dao.IEquipoDao;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Equipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoImp implements IEquipo {

    @Autowired
    private IEquipoDao equipoDao;

    @Override
    public Equipo save(Equipo equipo) {
        return equipoDao.save(equipo);
    }

    @Override
    public void delete(Integer id) {
        equipoDao.deleteById(id);
    }

    @Override
    public Equipo update(Integer id, Equipo newEquipo) {
        Optional<Equipo> equipo = equipoDao.findById(id);
        newEquipo.setId(equipo.get().getId());
        return equipoDao.save(newEquipo);
    }

    @Override
    public Optional<Equipo> findById(Integer id) {
        return equipoDao.findById(id);
    }

    @Override
    public Iterable<Equipo> findAll() {
        return equipoDao.findAll();
    }
}
