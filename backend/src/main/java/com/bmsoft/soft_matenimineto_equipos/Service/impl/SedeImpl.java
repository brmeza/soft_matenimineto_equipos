package com.bmsoft.soft_matenimineto_equipos.Service.impl;

import com.bmsoft.soft_matenimineto_equipos.Service.ISede;
import com.bmsoft.soft_matenimineto_equipos.model.dao.ISedeDao;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Sede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;

@Service
public class SedeImpl implements ISede {


    @Autowired
    private ISedeDao sedeDao;

    @Override
    public Sede save(Sede sede) {
        if (sedeDao.existsByNombreSede(sede.getNombreSede())){
            throw new IllegalArgumentException("la sede ya existe");
        }
        return sedeDao.save(sede);
    }

    @Override
    public void delete(Integer id) {
        sedeDao.deleteById(id);
    }

    @Override
    public Sede update(Integer id, Sede newSede)  {
        Optional<Sede> checkSede = sedeDao.findById(id);
        newSede.setId(checkSede.get().getId());
        return sedeDao.save(newSede);
    }

    @Override
    public Iterable<Sede> findAll() {
        return sedeDao.findAll();
    }

    @Override
    public Optional<Sede> findById(Integer id) {
        return sedeDao.findById(id);
    }


}
