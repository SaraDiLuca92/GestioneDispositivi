package com.example.demo.repository;

import com.example.demo.model.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispositivoRepository extends JpaRepository <Dispositivo,Long> {

}
