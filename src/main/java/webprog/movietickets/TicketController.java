package webprog.movietickets;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TicketController {

    private final ArrayList<Ticket> tickets = new ArrayList<Ticket>();
}
