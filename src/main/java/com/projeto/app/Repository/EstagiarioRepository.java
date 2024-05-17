package com.projeto.app.Repository;


import com.projeto.app.Model.Estagiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstagiarioRepository extends JpaRepository<Estagiario, Long> {
}
