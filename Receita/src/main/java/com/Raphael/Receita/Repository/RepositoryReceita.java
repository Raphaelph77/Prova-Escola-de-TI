package com.Raphael.Receita.Repository;
import com.Raphael.Receita.Modal.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryReceita extends JpaRepository <Receita, Long> {

}
