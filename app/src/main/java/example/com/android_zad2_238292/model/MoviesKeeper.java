package example.com.android_zad2_238292.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafał on 2018-03-24.
 */

public class MoviesKeeper {
    private static MoviesKeeper instance = null;
    private List<Movie> mMoviesList;
    private final String[] titles = {
            "Skazani na Shawshank", "Nietykalni", "Zielona mila", "Ojciec chrzestny", "Dwunastu gniewnych ludzi",
            "Forrest Gump", "Lot nad kukułczym gniazdem", "Ojciec chrzestny II", "Władca Pierścieni: Powrót króla",
            "Lista Schindlera", "Pulp Fiction", "Życie jest piękne", "Siedem", "Władca Pierścieni: Dwie wieże",
            "Podziemny krąg", "Chłopcy z ferajny", "Piękny umysł", "Pianista", "Incepcja", "Django"
    };

    private MoviesKeeper() {
        mMoviesList = new ArrayList<>();
        initMoviesList();
    }


    private void initMoviesList() {
        String imageUri = "movie";
        int i = 0;
        mMoviesList.add(new Movie(i, titles[i], "Dramat", imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Biograficzny",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Dramat",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Gangsterski",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Dramat Sądowy",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Dramat",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Psychologiczny",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Gangsterski",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Fantasy",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Wojenny",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Gangsterski",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Dramat",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Kryminał",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Fantasy",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Thriller",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Biograficzny",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Dramat",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Biograficzny",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Thriller",imageUri + (i++ % titles.length)));
        mMoviesList.add(new Movie(i,titles[i], "Western",imageUri + (i % titles.length))); }

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
