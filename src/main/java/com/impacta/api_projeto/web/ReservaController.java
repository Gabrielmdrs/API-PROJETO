package com.impacta.api_projeto.web;


import com.impacta.api_projeto.entity.Reserva;
import com.impacta.api_projeto.entity.ReservaDTO;
import com.impacta.api_projeto.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    private ReservaService service;
    @GetMapping
    public List<Reserva> list(){
        return service.list();
    }

    @PostMapping
    public Reserva create(@RequestBody ReservaDTO dadosReserva){
        return service.create(dadosReserva);
    }



}
