package com.bmsoft.soft_matenimineto_equipos.Controller;

import com.bmsoft.soft_matenimineto_equipos.Service.ISede;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Sede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class sedeController {

    @Autowired
    private ISede sedeService;


    //Listar todas las sedes
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/sede")
    public  Iterable<Sede> findAll(){
        return sedeService.findAll();
    }
    //obtener sede por id
    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/sede/{id}")
    public Optional<Sede> findAllById(@PathVariable Integer id){
        return sedeService.findById(id);
    }



    //Crear nueva sede
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/sede")
    public Sede create (@RequestBody Sede sede){
        return sedeService.save(sede);
    }


    //editar sede
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("sede/{id}")
    public Sede update (@PathVariable Integer id, @RequestBody Sede sede){
        return sedeService.update(id, sede);
    }


    //eliminar sede
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("sede/{id}")
    public  void delete (@PathVariable Integer id){
        sedeService.delete(id);
    }



}
