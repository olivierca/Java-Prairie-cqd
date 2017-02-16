package com.simplon.Library;

import java.util.ArrayList;

public class Library {
    private static final int maxDVD = 3;
    private static final int openTime = 1;
    private static final int closeTime = 7;

    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<CD> CDs = new ArrayList<CD>();
    private ArrayList<DVD> DVDs = new ArrayList<DVD>();

    public ArrayList<Book> putBooks(ArrayList<Book> books)
    {
        this.books.addAll(books);
        return this.books;
    }

    public ArrayList<CD> putCDs(ArrayList<CD> cds)
    {
        CDs.addAll(cds);
        return CDs;
    }

    public ArrayList<DVD> putDvds(ArrayList<DVD> dvds)
    {
        if(DVDs.size()<=maxDVD) {
            int i = 0;
            int y = 0;
            DVD dvd,dvd1;

            // vérifier si un DVD est déja dans la librarie
            if(DVDs.size()>0) {
                while (DVDs.get(i).getClass() != null) {
                    while (dvds.get(y).getClass() != null) {
                        if (DVDs.get(i).equals(dvds.get(y))) return DVDs;
                        y++;
                    }
                    i++;
                }
            }
            // Ajouter les DVDs dans la librairie
            i = 0;
            while (DVDs.size() < maxDVD && i < dvds.size()) {
                DVDs.add(dvds.get(i));
                i++;
            }
        }
        return DVDs;
    }

    public boolean isOpen(int hour) {
        return (hour >= openTime && hour <= closeTime);
    }

}
