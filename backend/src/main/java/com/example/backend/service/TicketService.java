package com.example.backend.service;

import com.example.backend.model.postgres.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    List<Ticket> findAll();
    Optional<Ticket> findById(Long id);
    Ticket createTicket(Ticket ticket);
    Ticket updateTicket(Long id, Ticket ticket);
    void deleteTicket(Long id);
}
