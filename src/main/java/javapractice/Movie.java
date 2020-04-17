package javapractice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Movie implements Comparable<Movie> {

    private String name;

    private float rating;

    private int year;

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    @Override
    public String toString(){
        return "Movie:: name:"+name+", rating:"+rating + ", year:" + year;
    }

}
