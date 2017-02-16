package com.simplo.UniqueChar;


public class UniqueChar {

    private static final int charOffset = 97;
    private int alpha[]= new int[26];         // table compteur d'occurance de caractères
    private int index;

    public String is_unique(String string)
    {
        int i;
        for( i=0; i< 26 ; i++) alpha[i] = 0;      // init la table compteur d'occurance
        for( i=0; i < string.length();i++)
        {
            index = string.codePointAt(i);
            if(++alpha[index-charOffset] > 1)    return "KO";

        }
        return "OK";
    }
}
