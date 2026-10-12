package io.github.promptrk;

public class App {
    public static void main(String[] args) {
        Watchlist watchlist = new Watchlist();
        System.out.println("Movie Watchlist CLI: ");
        
        watchlist.addMovie("Inception");
        watchlist.addMovie("Leo");
        
        System.out.println("Total movies in watchlist: " + watchlist.getCount());
        for (String movie : watchlist.getMovies()) {
            System.out.println("- " + movie);
        }
    }
}
