package webprog.movietickets;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class TicketController {

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

    }
}
