package com.simplon.Library;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class LibraryTest {
    Library library = new Library();

    @Test
    public void TestBooks()
    {
        //set
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("l'Univers elegant",40));

        // test
        ArrayList<Book> result = library.putBooks(books);

        //assert
        assertEquals(1,result.size());

    }

    @Test
    public void TestCDs()
    {
        //set
        ArrayList<CD> cds = new ArrayList<CD>();
        cds.add(new CD("Aja",45));

        // test
        ArrayList<CD> result = library.putCDs(cds);

        //assert
        assertEquals(1,result.size());

    }

    @Test
    public void addLibrary_4()
    {
        //set
        ArrayList<DVD> dvds = new ArrayList<DVD>();
        library = new Library();

        dvds.add( new DVD("dvd", 120, Movie.HORROR, false));
        dvds.add( new DVD("Brasil", 120, Movie.FUN, false));
        dvds.add( new DVD("Xanadu", 90, Movie.MUSICAL, false));

        // test
        ArrayList<DVD> result = library.putDvds(dvds);

        //assert
        assertTrue(result.size()<=3);

        dvds.add( new DVD("Mars", 120, Movie.ACTION, false));
        dvds.add( new DVD("Les 3 frères", 90, Movie.FUN, false));
        dvds.add( new DVD("Rambot", 90, Movie.ACTION, false));
        dvds.add( new DVD("Fame", 90, Movie.MUSICAL, false));

        // test
        result = library.putDvds(dvds);

        //assert
        assertEquals(3,result.size());
    }

    @Test
    public void TestSameDVD()
    {
        //set
        ArrayList<DVD> result;
        ArrayList<DVD> dvds = new ArrayList<DVD>();
        library = new Library();
        dvds.add( new DVD("dvd", 120, Movie.HORROR, false));

        //test
        result = library.putDvds(dvds); // Le libraire à 1DVD

        //assert
        assertTrue(result.size()<=3);

        //set new dvds
        dvds.remove(0);     // retire le dvd du libraire
        dvds.add( new DVD("Shyning", 120, Movie.HORROR, false));
        dvds.add( new DVD("dvd", 120, Movie.HORROR, false));
        dvds.add( new DVD("Mairie à tout prie", 100, Movie.FUN, false));
        dvds.add( new DVD("Newyork-Newyork", 90, Movie.MUSICAL, false));

        // test si 1 DVD est identique
        result = library.putDvds(dvds);

        //assert
        assertEquals(3,result.size());
    }

    @Test
    public void isOpen_at_5pm()
    {
        // test
        boolean result = library.isOpen(5);

        //assert
        assertTrue(result);
    }

}
