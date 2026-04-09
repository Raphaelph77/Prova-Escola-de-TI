package com.Raphael.Receita.Repository;
import com.Raphael.Receita.Modal.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryIngrediente extends JpaRepository<Ingrediente, Long> {

}
