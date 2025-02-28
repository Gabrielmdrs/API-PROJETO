package com.impacta.api_projeto.service;

import com.impacta.api_projeto.entity.Reserva;
import com.impacta.api_projeto.entity.ReservaDTO;
import com.impacta.api_projeto.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository repository;

    public List<Reserva> list(){
        return repository.findAll();
    }

    public Reserva create(ReservaDTO dadosReserva) {
        return repository.save(new Reserva(dadosReserva));
    }

}
