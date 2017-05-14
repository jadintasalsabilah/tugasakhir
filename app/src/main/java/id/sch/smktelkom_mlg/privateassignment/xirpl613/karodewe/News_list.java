package id.sch.smktelkom_mlg.privateassignment.xirpl613.karodewe;

import java.io.Serializable;

/**
 * Created by Smktelkom on 5/14/2017.
 */

public class News_list implements Serializable {
    private String image;
    private String judul;
    private String popular;

    public News_list(String image, String judul, String popular) {
        this.image = image;
        this.judul = judul;
        this.popular = popular;
    }

    public String getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }

    public String getPopular() {
        return popular;
    }
}
