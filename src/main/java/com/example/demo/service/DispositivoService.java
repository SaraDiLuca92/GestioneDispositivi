package com.example.demo.service;

import com.example.demo.model.Dispositivo;
import com.example.demo.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DispositivoService {
    @Autowired
    DispositivoRepository dispositivoRepository;

    //definisco il metodo per prendere tutti i dispositivi
    public List<Dispositivo> getAllDispositivi(){
        return dispositivoRepository.findAll();

    }

    //definisco il metodo per prendere un dispositivo in base all'id
    public Dispositivo getDispositivoById(Long id){return dispositivoRepository.findById(id).orElse(null);}

    //definisco il metodo per cancellare un dispositivo in base all'id
    public void deleteByIdDispositivo(Long id){
        dispositivoRepository.deleteById(id);
    }

    //definisco il metodo per salvare o aggiornare un dispositivo

    public Dispositivo saveOrUpdateDispositivo(Dispositivo dispositivo){return dispositivoRepository.save(dispositivo);}
}
