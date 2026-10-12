package io.github.promptrk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WatchlistTest {

    @Test
    public void testAddMovie() {
        Watchlist watchlist = new Watchlist();
        watchlist.addMovie("Bigil");
        
        assertEquals(1, watchlist.getCount());
        assertTrue(watchlist.getMovies().contains("Bigil"));
    }
}
