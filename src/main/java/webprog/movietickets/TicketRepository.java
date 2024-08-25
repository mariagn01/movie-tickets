package webprog.movietickets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TicketRepository {

    @Autowired
    private JdbcTemplate db;

    Logger logger = LoggerFactory.getLogger(TicketRepository.class);

    public boolean saveTicket (Ticket ticket) {
        String sql = "INSERT INTO "
    }
}
