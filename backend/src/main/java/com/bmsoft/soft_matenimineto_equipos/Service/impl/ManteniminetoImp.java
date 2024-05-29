package com.bmsoft.soft_matenimineto_equipos.Service.impl;

import com.bmsoft.soft_matenimineto_equipos.Service.IMantenimiento;
import com.bmsoft.soft_matenimineto_equipos.model.dao.IMantenimientoDao;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Equipo;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Mantenimineto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManteniminetoImp implements IMantenimiento {

    @Autowired
    private IMantenimientoDao mantenimientoDao;

    @Override
    public Mantenimineto save(Mantenimineto mantenimineto) {
        return mantenimientoDao.save(mantenimineto);
    }

    @Override
    public void delete(Integer id) {
        mantenimientoDao.deleteById(id);
    }

    @Override
    public Mantenimineto update(Integer id, Mantenimineto mantenimineto) {
        Optional<Mantenimineto> checkExist = mantenimientoDao.findById(id);
        mantenimineto.setId(checkExist.get().getId());
        return mantenimientoDao.save(mantenimineto);
    }

    @Override
    public Optional<Mantenimineto> findById(Integer id) {
        return mantenimientoDao.findById(id);
    }

    @Override
    public Iterable<Mantenimineto> findAll() {
        return mantenimientoDao.findAll();
    }
}
