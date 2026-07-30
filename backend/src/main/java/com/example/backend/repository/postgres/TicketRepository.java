package com.example.backend.repository.postgres;

import com.example.backend.model.postgres.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
