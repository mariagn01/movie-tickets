package webprog.movietickets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TicketController {

    private final ArrayList<Ticket> tickets = new ArrayList<>();

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
}
