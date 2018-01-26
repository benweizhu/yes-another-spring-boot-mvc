package mvc.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "TICKET")
public class Ticket {
    @Id
    @GeneratedValue(strategy = AUTO, generator = "A_TICKET_SEQ")
    @SequenceGenerator(name = "A_TICKET_SEQ")
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    public Ticket() {
    }

    public Ticket(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
