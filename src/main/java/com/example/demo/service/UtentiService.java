package com.example.demo.service;

import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.github.javafaker.Faker;


@Service
public class UtentiService {
    @Autowired
    UtenteRepository utenteRepository;

    //definisco il metodo per prendere tutti gli utenti
    public List<Utente> getAllUsers(){
       return utenteRepository.findAll();

    }

    //definisco il metodo per prendere un utente un base all'id
    public Utente getUserById(Long id){return utenteRepository.findById(id).orElse(null);}

    //definisco il metodo per cancellare l'utente in base all'id
    public void deleteById(Long id){
        utenteRepository.deleteById(id);
    }

    //definisco il metodo per salvare o aggiornare un utente

    public Utente saveOrUpdate(Utente utente){return utenteRepository.save(utente);}

}
