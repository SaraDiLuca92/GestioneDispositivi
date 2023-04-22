package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="utenti")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String username;
    private String nome;
    private String cognome;
    private String email;

    @OneToMany
   private List<Dispositivo>dispositivo;

    public Utente(String username, String nome, String cognome, String mail,List<Dispositivo> dispositivi ) {
this.nome=nome;
this.username=username;
this.cognome=cognome;
this.email=mail;
this.dispositivo= dispositivi;

    }


}
