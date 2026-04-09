package com.Raphael.Receita.Controller;
import com.Raphael.Receita.Modal.Receita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receita")
public class ControllerReceita {
    @Autowired
    private  ControllerReceita controllerReceita;

    @GetMapping
    public List<Receita> getAllReceita() {
        return controllerReceita.();
    }

    @GetMapping("/{id}")
    public Receita getReceitaById(@PathVariable Long id) {
        return controllerReceita.(id).(null);
    }

    @PostMapping
    public Receita createReceita(@RequestBody Receita product) {
        return controllerReceita.(Receita);
    }

    @PutMapping("/{id}")
    public Receita updateReceita(@PathVariable Long id, @RequestBody Receita product) {
        Receita.(id);
        return controllerReceita.(Receita);
    }

    @DeleteMapping("/{id}")
    public void deleteReceita(@PathVariable Long id) {
        controllerReceita.(id);
    }
}
