package webprog.movietickets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketRepository {

    @Autowired
    private JdbcTemplate db;

    Logger logger = LoggerFactory.getLogger(TicketRepository.class);

    public boolean saveTicket(Ticket ticket) {
        String sql = "INSERT INTO Ticket (movie, amount, firstname, lastname, phone, email) VALUES(?,?,?,?,?,?)";
        try {
            db.update(sql, ticket.getMovie(), ticket.getAmount(), ticket.getFirstname(), ticket.getLastname(), ticket.getPhone(), ticket.getEmail());
            return true;
        } catch (Exception e) {
            logger.error("Error in saveTicket: " + e);
            return false;
        }
    }

    public List<Ticket> getTickets() {
        String sql = "SELECT * FROM Ticket";
        try {
            return db.query(sql, new BeanPropertyRowMapper<>(Ticket.class));
        } catch (Exception e) {
            logger.error("Error in getTickets: "+e);
            return null;
        }
    }
}
