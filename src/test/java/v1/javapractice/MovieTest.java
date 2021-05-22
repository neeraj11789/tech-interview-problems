package v1.javapractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class MovieTest {

    List<Movie> movies = new ArrayList<>();

    @BeforeEach
    void setUp() {
        movies.add(new Movie("Parasite", 9.8F, 2019));
        movies.add(new Movie("Joker", 9.7F, 2020));
        movies.add(new Movie("Ford Vs Ferrari", 9.6F, 2018));
        movies.add(new Movie("Silver Linings", 9.0F, 2015));
        movies.add(new Movie("Tamasha", 7.0F, 2014));

        System.out.println("Before Sorting: ");
        Iterator<Movie> iterator = movies.iterator();
        while (iterator.hasNext()){
            Movie m = iterator.next();
            System.out.println(m);
        }
    }

    @Test
    void compareTo() {
        System.out.println("Comparing using Comparable Interface Methods");

        Collections.sort(movies);
        System.out.println("After Sorting: ");
        Iterator<Movie> i = movies.iterator();
        while (i.hasNext()){
            Movie m = i.next();
            System.out.println(m);
        }
    }

    @Test
    void yearComparator(){
        System.out.println("Comparing using Year Comparator Interface Methods");

        Collections.sort(movies, new MovieYearComparator());
        System.out.println("After Sorting: ");
        Iterator<Movie> i = movies.iterator();
        while (i.hasNext()){
            Movie m = i.next();
            System.out.println(m);
        }
    }

    @Test
    void ratingComparator(){
        System.out.println("Comparing using Rating Comparator Interface Methods");

        Collections.sort(movies, new MovieRatingComparator());
        System.out.println("After Sorting: ");
        Iterator<Movie> i = movies.iterator();
        while (i.hasNext()){
            Movie m = i.next();
            System.out.println(m);
        }
    }

    @Test
    void nameComparator(){
        System.out.println("Comparing using Name Comparator Interface Methods");

        Collections.sort(movies, new MovieNameComparator());
        System.out.println("After Sorting: ");
        Iterator<Movie> i = movies.iterator();
        while (i.hasNext()){
            Movie m = i.next();
            System.out.println(m);
        }
    }
}