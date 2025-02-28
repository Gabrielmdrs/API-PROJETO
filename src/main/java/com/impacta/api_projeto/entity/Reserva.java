package com.impacta.api_projeto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

@Entity (name = "Reserva")
@Table(name = "Reservas")

public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String destino;
    @NotBlank
    private String data;

    public Reserva (String destino, String data){
        this.destino = destino;
        this.data = data;

    }


    public Reserva(ReservaDTO dadosReserva) {
        this.destino = dadosReserva.destino();
        this.data = dadosReserva.data();
    }


}
