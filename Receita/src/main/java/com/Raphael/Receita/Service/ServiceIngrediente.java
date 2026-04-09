package com.Raphael.Receita.Service;

import com.Raphael.Receita.Modal.Ingrediente;
import com.Raphael.Receita.Repository.RepositoryIngrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ServiceIngrediente {
    @Autowired
    private RepositoryIngrediente repositoryIngrediente;

    public Ingrediente salvar(Ingrediente ingrediente){
        ingrediente = repositoryIngrediente.save(ingrediente);
        return ingrediente;
    }
    public Ingrediente alterar(Ingrediente ingrediente){
        if(Objects.nonNull(ingrediente.getId()))
           ingrediente = repositoryIngrediente.save(ingrediente);
        return ingrediente;
    }

}
