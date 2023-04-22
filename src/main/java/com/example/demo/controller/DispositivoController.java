package com.example.demo.controller;

import com.example.demo.model.Dispositivo;
import com.example.demo.model.Utente;
import com.example.demo.service.DispositivoService;
import com.example.demo.service.UtentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DispositivoController {
    @Autowired
    private DispositivoService dispositivoService;

    //Prendi tutti i dispositivi
    @GetMapping("/dispositivi")
    private List<Dispositivo> getAllDispositivi(){
        return dispositivoService.getAllDispositivi();
    }

    //Prendi il dispositivo in base all'id fornito
    @GetMapping("/dispositivi/{id}")
    private Dispositivo getDispositivo(@PathVariable("id") Long id){return dispositivoService.getDispositivoById(id);
    }

    //Cancella il dispositivo in base all'id fornito
    @DeleteMapping("/dispositivi/{id}")
    private void deleteDispositivo(@PathVariable("id")Long id){dispositivoService.deleteByIdDispositivo(id);}

    //Aggiungi dispositivo
    @PostMapping("/dispositivi")
    private Long saveDispositivo(@RequestBody Dispositivo dispositivo){
        dispositivoService.saveOrUpdateDispositivo(dispositivo);
        return dispositivo.getId();
    }

    //Aggiorna dispositivo
    @PutMapping("/dispositivi")
    private Dispositivo updateDispositivo (@RequestBody Dispositivo dispositivo){return dispositivoService.saveOrUpdateDispositivo(dispositivo);
    }
}
