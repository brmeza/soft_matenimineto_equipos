package com.bmsoft.soft_matenimineto_equipos.Controller;

import com.bmsoft.soft_matenimineto_equipos.Service.ISala;
import com.bmsoft.soft_matenimineto_equipos.model.dao.ISalaDao;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class SalaController {

    @Autowired
    private ISala salaService;

    //crear
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/sala")
    public Sala create(@RequestBody Sala sala){
        return salaService.save(sala);
    }

    //eliminar
    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/sala/{id}")
    public void delete(@PathVariable Integer id){
        salaService.delete(id);
    }

    //update
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/sala/{id}")
    public Sala update(@PathVariable Integer id, @RequestBody Sala sala){
        return salaService.update(id,sala);
    }


    //listar todoo
    @GetMapping("/sala")
    public Iterable<Sala> findAll(){
        return salaService.findAll();
    }

    //listar una
    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/sala/{id}")
    public Optional<Sala> findById(@PathVariable Integer id){
        return salaService.findById(id);
    }









}
