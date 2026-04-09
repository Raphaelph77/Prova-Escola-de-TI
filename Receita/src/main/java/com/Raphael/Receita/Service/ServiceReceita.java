package com.Raphael.Receita.Service;
import com.Raphael.Receita.Modal.Receita;
import com.Raphael.Receita.Repository.RepositoryReceita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ServiceReceita {
    @Autowired
    private RepositoryReceita repositoryReceita;

    public Receita salvar(Receita receita){
        receita =repositoryReceita.save(receita);
        return receita;
    }
    public Receita alterar(Receita receita){
        if(Objects.nonNull(receita.getId()))
            receita = repositoryReceita.save(receita);
        return receita;
    }
   public boolean excluir(Receita receita){
        receita= repositoryReceita.delete(receita);
        return receita;
    }
}
