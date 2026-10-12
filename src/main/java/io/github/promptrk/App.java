package io.github.promptrk;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Watchlist watchlist = new Watchlist();
        System.out.println("Movie Watchlist CLI: ");
        
        watchlist.addMovie("Inception");
        watchlist.addMovie("Leo");
        
        System.out.println("Total movies in watchlist: " + watchlist.getCount());
        String[] arr = watchlist.getMovies().toArray(new String[0]);
        for (int i=0; i<watchlist.getCount(); ++i) {
            System.out.printf("(%d) - %s", i+1, arr[i]);
        }
    }
}
