package example.com.android_zad2_238292.model;

/**
 * Created by Rafał on 2018-03-24.
 */

public class Movie {
    private long id;
    private String title;
    private String category;
    private String image;


    public Movie(long id, String title, String category, String image) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
