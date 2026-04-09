package com.Raphael.Receita.Controller;
import com.Raphael.Receita.Modal.Ingrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/ingredientes")
public class ControllerIngrediente {
    @Autowired
    private ControllerIngrediente controllerIngrediente;

    @GetMapping
    public List<Ingrediente> getAllIngrediente() {
        return controllerIngrediente.getAllIngrediente();
    }

    @GetMapping("/{id}")
    public Ingrediente getIngredienteById(@PathVariable Long id) {
        return controllerIngrediente.(id)
    }

    @PostMapping
    public Ingrediente createIngrediente(@RequestBody Ingrediente product) {
        return controllerIngrediente.getIngredienteById(Long);
    }
    @PutMapping("/{id}")
    public Ingrediente updateIngrediente(@PathVariable Long id, @RequestBody Ingrediente product) {
        product.setId(id);
        return controllerIngrediente.
    }

    @DeleteMapping("/{id}")
    public void deleteIngrediente(@PathVariable Long id) {
        controllerIngrediente.
    }

}
