package mvc.controller;

import mvc.entity.Ticket;
import mvc.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @RequestMapping(value = "/ticket/{id}")
    public Ticket getTicket(@PathVariable long id) {
        return ticketRepository.findOne(id);
    }
}
