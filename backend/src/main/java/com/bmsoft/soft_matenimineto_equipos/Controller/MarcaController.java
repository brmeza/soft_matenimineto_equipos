package com.bmsoft.soft_matenimineto_equipos.Controller;

import com.bmsoft.soft_matenimineto_equipos.Service.IMarca;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MarcaController {

    @Autowired
    private IMarca marcaService;

    //save
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/marca")
    public Marca save (Marca marca){
        return marcaService.save(marca);
    }

    //Delete
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/marca/{id}")
    public void delete(@PathVariable  Integer id){
        marcaService.delete(id);
    }

    //update
    @ResponseStatus
    @PutMapping("/marca/{id}")
    public Marca update(@PathVariable Integer id, @RequestBody Marca marca){
         return marcaService.update(id, marca);
    }

    //get 1
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/marca/{id}")
    public Optional<Marca> findById(@PathVariable Integer id){
        return marcaService.findById(id);
    }

    //FIND ALL
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/marca")
    public Iterable<Marca> findAll(){
        return marcaService.findAll();
    }




}
