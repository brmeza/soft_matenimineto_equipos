package com.bmsoft.soft_matenimineto_equipos.Service.impl;

import com.bmsoft.soft_matenimineto_equipos.Service.IMarca;
import com.bmsoft.soft_matenimineto_equipos.model.dao.IMarcaDao;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarcaImp implements IMarca{

    @Autowired
    private IMarcaDao marcaDao;


    @Override
    public Marca save(Marca marca) {
        if (marcaDao.existsByNombreMarca(marca.getNombreMarca())){
            throw new IllegalArgumentException("La marca ya esta");
        }
        return marcaDao.save(marca);
    }

    @Override
    public void delete(Integer id) {
        marcaDao.deleteById(id);
    }

    @Override
    public Marca update(Integer id, Marca newMarca) {
        Optional<Marca> marca = marcaDao.findById(id);
        newMarca.setId(marca.get().getId());
        return marcaDao.save(newMarca);
    }

    @Override
    public Optional<Marca> findById(Integer id) {
        return marcaDao.findById(id);
    }

    @Override
    public Iterable<Marca> findAll() {
        return marcaDao.findAll();
    }
}
