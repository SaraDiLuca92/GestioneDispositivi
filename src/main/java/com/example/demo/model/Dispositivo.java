package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="dispositivi")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private StatoDispositivo stato;
    @Enumerated(EnumType.STRING)
    private TipoDispositivo tipo;

    public Dispositivo(StatoDispositivo statoDispositivo, TipoDispositivo tipoDispositivo) {

    this.stato=statoDispositivo;
    this.tipo=tipoDispositivo;}
}
