package com.example.demo.repository;

import com.example.demo.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository <Utente,Long> {
}
