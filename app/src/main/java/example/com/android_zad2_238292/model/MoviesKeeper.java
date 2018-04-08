package example.com.android_zad2_238292.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rafał on 2018-03-24.
 */

public class MoviesKeeper {
    private static MoviesKeeper instance = null;
    private List<Movie> mMoviesList;
    private Map<String, String> movies;

    private MoviesKeeper() {
        movies = new HashMap<>();
        mapFillWithValues();
        mMoviesList = new ArrayList<>();
        initMoviesList();
    }

    private void mapFillWithValues() {
        movies.put("Skazani na Shawshank", "Dramat");
        movies.put("Nietykalni", "Biograficzny");
        movies.put("Zielona mila", "Dramat");
        movies.put("Ojciec chrzestny", "Gangsterski");
        movies.put("Dwunastu gniewnych ludzi", "Dramat Sądowy");
        movies.put("Forrest Gump", "Dramat");
        movies.put("Lot nad kukułczym gniazdem", "Psychologiczny");
        movies.put("Ojciec chrzestny II", "Gangsterski");
        movies.put("Władca Pierścieni: Powrót króla", "Fantasy");
        movies.put("Lista Schindlera", "Wojenny");
        movies.put("Pulp Fiction", "Gangsterski");
        movies.put("Życie jest piękne", "Dramat");
        movies.put("Siedem", "Kryminał");
        movies.put("Władca Pierścieni: Dwie wieże", "Fantasy");
        movies.put("Podziemny krąg", "Thriller");
        movies.put("Chłopcy z ferajny", "Dramat");
        movies.put("Piękny umysł", "Biograficzny");
        movies.put("Pianista", "Biograficzny");
        movies.put("Incepcja", "Thriller");
        movies.put("Django", "Western");
    }

    private void initMoviesList() {
        String imageUri = "movie";
        int i = 0;
        for (Map.Entry<String, String> entry : movies.entrySet()) {
            mMoviesList.add(new Movie(i, entry.getKey(), entry.getValue(), imageUri + (i % movies.size())));
            i++;
        }
    }

    public List<Movie> getMoviesList() {
        return mMoviesList;
    }

    public static MoviesKeeper getInstance() {
        if (instance == null) {
            instance = new MoviesKeeper();
        }
        return instance;
    }
}
