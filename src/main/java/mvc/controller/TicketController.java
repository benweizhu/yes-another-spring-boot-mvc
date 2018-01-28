package mvc.controller;

import mvc.entity.Ticket;
import mvc.repository.TicketRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    private static final Logger LOGGER = getLogger(TicketController.class);

    @RequestMapping(value = "/ticket/{id}")
    public Ticket getTicket(@PathVariable long id) {
        LOGGER.error("error get ticket %d", id);
        return ticketRepository.findOne(id);
    }
}
