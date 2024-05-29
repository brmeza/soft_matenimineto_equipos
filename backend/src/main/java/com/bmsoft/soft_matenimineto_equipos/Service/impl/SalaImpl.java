package com.bmsoft.soft_matenimineto_equipos.Service.impl;

import com.bmsoft.soft_matenimineto_equipos.Service.ISala;
import com.bmsoft.soft_matenimineto_equipos.model.dao.ISalaDao;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SalaImpl implements ISala {

    @Autowired
    private ISalaDao salaDao;


    @Override
    public Sala save(Sala sala) {
        return salaDao.save(sala);
    }

    @Override
    public void delete(Integer id) {
        salaDao.deleteById(id);
    }

    @Override
    public Sala update(Integer id, Sala newSala) {
        Optional<Sala> sala = salaDao.findById(id);
        newSala.setId(sala.get().getId());
        return salaDao.save(newSala);
    }

    @Override
    public Iterable<Sala> findAll() {
        return salaDao.findAll();
    }

    @Override
    public Optional<Sala> findById(Integer id) {
        return salaDao.findById(id);
    }
}
