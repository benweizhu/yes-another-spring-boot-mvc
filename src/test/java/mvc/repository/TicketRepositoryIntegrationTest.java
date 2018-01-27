package mvc.repository;

import mvc.Application;
import mvc.entity.Ticket;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class TicketRepositoryIntegrationTest {

    @Autowired
    private TicketRepository ticketRepository;

    @Test
    public void shouldGetTicket() {
        Ticket ticket = ticketRepository.findOne(1l);
        assertThat(ticket.getName(), is("变形金刚"));
    }
}