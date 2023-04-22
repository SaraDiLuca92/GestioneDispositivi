package com.example.demo.controller;


import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteRepository;
import com.example.demo.service.UtentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtenteController {
    @Autowired
    private UtentiService utenteService;

    //Prendi tutti gli utenti
    @GetMapping("/users")
    private List<Utente>getAllUsers(){
        return utenteService.getAllUsers();
    }

    //Prendi l'utente in base all'id fornito
    @GetMapping("/users/{id}")
    private Utente getUser(@PathVariable("id") Long id){return utenteService.getUserById(id);
    }

    //Cancella l'utente in base all'id fornito
    @DeleteMapping("/users/{id}")
    private void deleteUser(@PathVariable("id")Long id){utenteService.deleteById(id);}

    //Aggiungi utente
    @PostMapping("/users")
    private Long saveUser(@RequestBody Utente utente){
       utenteService.saveOrUpdate(utente);
        return utente.getId();
    }

    //Aggiorna utente
    @PutMapping("/users")
    private Utente update (@RequestBody Utente utente){return utenteService.saveOrUpdate(utente);
    }}



