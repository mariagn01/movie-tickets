package webprog.movietickets;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TicketController {

    @Autowired
    public TicketRepository rep;

    @GetMapping("/getMovies")
    public ArrayList<String> getMovies () {
        ArrayList<String> movielist = new ArrayList<>();
        movielist.add("Oppenheimer");
        movielist.add("Barbie");
        movielist.add("Dune");
        movielist.add("The Crow");
        movielist.add("Deadpool & Wolverine");
        return movielist;
    }

    @PostMapping("/saveTicket")
    public void saveTicket(Ticket ticket, HttpServletResponse response) throws IOException {
        if(!rep.saveTicket(ticket)) {
            response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Error in database, could not save ticket");
        }
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets (HttpServletResponse response) throws IOException {
        //Using try/catch for errors that occur during the retrieval of tickets
        try {
            List<Ticket> tickets = rep.getTickets();
            //Using if-statement to handle cases where the tickets are null or empty
            if (tickets == null) {
                response.sendError(HttpStatus.NO_CONTENT.value(), "No tickets found");
                return null;
            }
            return tickets;
        } catch (Exception e) {
            response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Error in database: "+e);
            return null;
        }
    }

    @GetMapping("/deleteTicket")
    public void deleteTicket (int id) {
        rep.deleteTicket(id);
    }
}
