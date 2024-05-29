package com.bmsoft.soft_matenimineto_equipos.Controller;

import com.bmsoft.soft_matenimineto_equipos.Service.IMonitor;
import com.bmsoft.soft_matenimineto_equipos.model.entity.Monitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MonitorController {

    @Autowired
    private IMonitor monitorService;

    //guardar
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/monitor")
    public Monitor create(@RequestBody Monitor monitor){
        return monitorService.save(monitor);
    }

    //eliminar
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/monitor/{id}")
    public void delete (@PathVariable Integer id){
        monitorService.delete(id);
    }

    //update
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/monitor/{id}")
    public Monitor update (@PathVariable Integer id, @RequestBody Monitor monitor){
        return monitorService.update(id,monitor);
    }

    //get 1
    @GetMapping("/monitor/{id}")
    public Optional<Monitor> findById(@PathVariable Integer id){
        return monitorService.findById(id);
    }

    //get all
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/monitor")
    public Iterable<Monitor> findAll(){
        return monitorService.findAll();
    }



}
