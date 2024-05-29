package com.bmsoft.soft_matenimineto_equipos.Controller;

import com.bmsoft.soft_matenimineto_equipos.Service.IEquipo;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Equipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EquipoController {

    @Autowired
    private IEquipo equipoService;

    //create
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/equipo")
    public Equipo create(Equipo equipo){
        return equipoService.save(equipo);
    }

    //delete
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/equipo/{id}")
    public void Delete(@PathVariable Integer id){
        equipoService.delete(id);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/equipo/{id}")
    public Equipo update (@PathVariable Integer id, @RequestBody Equipo equipo){
        return equipoService.update(id, equipo);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping("/equipo/{id}")
    public Optional<Equipo> findById(@PathVariable Integer id){
        return equipoService.findById(id);
    }


    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping("/equipo")
    public Iterable<Equipo> findAll(){
        return equipoService.findAll();
    }




}
