package com.bmsoft.soft_matenimineto_equipos.Controller;

import com.bmsoft.soft_matenimineto_equipos.Service.IMantenimiento;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Mantenimineto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MantenimientoController {

    @Autowired
    private IMantenimiento mantenimientoService;


    //create
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/mantenimiento")
    public Mantenimineto Create(@RequestBody Mantenimineto mantenimineto){
        return mantenimientoService.save(mantenimineto);
    }

    //delete
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/mantenimiento/{id}")
    public void  delete(@PathVariable Integer id){
        mantenimientoService.delete(id);
    }

    //update
    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/mantenimiento/{id}")
    public Mantenimineto update(@PathVariable Integer id, @RequestBody Mantenimineto mantenimineto){
        return mantenimientoService.update(id,mantenimineto);
    }


    //find 1
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/mantenimiento/{id}")
    public Optional<Mantenimineto> findById(@PathVariable Integer id){
        return mantenimientoService.findById(id);
    }

    //find all
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/mantenimiento")
    public Iterable<Mantenimineto> findAll(){
        return mantenimientoService.findAll();
    }



}
