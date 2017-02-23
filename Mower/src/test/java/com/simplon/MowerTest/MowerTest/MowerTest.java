package com.simplon.MowerTest;


import com.simplon.Mower.Direction;
import com.simplon.Mower.Mower;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MowerTest {

    int sizeGrilleX=0;                                   // taille de la grille en X
    int sizeGrilleY=0;                                   // taille de la grille en Y
    int posX = 0;
    int posY = 0;
    String ligne = "";
    Direction dir;
    
    @Test               // test tondeuse 1
    public void movemower_1()
    {
        // lecture de la programmation de la tondeuse
        try {

            BufferedReader fichier = new BufferedReader(new FileReader("Prog_Mower.txt"));
            if ((ligne = fichier.readLine()) != null)
            {
                sizeGrilleX = Integer.parseInt(String.valueOf(ligne.charAt(0)));    // lecture de la taille de la grille en X
                sizeGrilleY = Integer.parseInt(String.valueOf(ligne.charAt(1)));    // lecture de la taille de la grille en Y
            }
            if((ligne = fichier.readLine()) != null)
            {
                posX = Integer.parseInt(String.valueOf(ligne.charAt(0)));   // position X de départ
                posY = Integer.parseInt(String.valueOf(ligne.charAt(1)));   // position Y de départ

                switch(ligne.charAt(2)){
                    case 'E':
                        dir = Direction.E;
                        break;
                    case 'O':
                        dir = Direction.O;
                        break;
                    case 'S':
                        dir = Direction.S;
                        break;
                    default:
                        dir = Direction.N;
                        break;

                }
                Mower Mower_1 = new Mower(posX,posY,dir);             // init la tondeuse 1
                Mower_1.setGrille(sizeGrilleX,sizeGrilleY);

                if((ligne = fichier.readLine()) != null)                // lecture des déplacements de la tondeuse
                Mower_1.move(ligne);                                  // lance led deplacements de la tondeuse
                System.out.print(Mower_1);                              // affiche la position finale

            }
            fichier.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test       // test tondeuse 2
    public void movemower_2()
    {
        // lecture de la programmation de la tondeuse
        try {

            BufferedReader fichier = new BufferedReader(new FileReader("Prog_Mower.txt"));
            if ((ligne = fichier.readLine()) != null)
            {
                sizeGrilleX = Integer.parseInt(String.valueOf(ligne.charAt(0)));    // lecture de la taille de la grille en X
                sizeGrilleY = Integer.parseInt(String.valueOf(ligne.charAt(1)));    // lecture de la taille de la grille en Y
            }
            // zappe la 1ere tondeuse
            ligne = fichier.readLine();
            ligne = fichier.readLine();
            if((ligne = fichier.readLine()) != null)
            {
                posX = Integer.parseInt(String.valueOf(ligne.charAt(0)));   // position X de départ
                posY = Integer.parseInt(String.valueOf(ligne.charAt(1)));   // position Y de départ

                switch(ligne.charAt(2)){
                    case 'E':
                        dir= Direction.E;
                        break;
                    case 'O':
                        dir= Direction.O;
                        break;
                    case 'S':
                        dir = Direction.S;
                        break;
                    default:
                        dir = Direction.N;
                        break;

                }
                Mower Mower_2 = new Mower(posX,posY,dir);             // init la tondeuse 1
                Mower_2.setGrille(sizeGrilleX,sizeGrilleY);

                if((ligne = fichier.readLine()) != null)                // lecture des déplacements de la tondeuse

                Mower_2.move(ligne);                                  // lance les deplacements de la tondeuse
                System.out.print(Mower_2);                              // affiche la position finale

            }
            fichier.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test               // test les tondeuses
    public void movemower() {
        // lecture de la programmation de la tondeuse
        try {

            BufferedReader fichier = new BufferedReader(new FileReader("Prog_Mower.txt"));
            if ((ligne = fichier.readLine()) != null)
            {
                sizeGrilleX = Integer.parseInt(String.valueOf(ligne.charAt(0)));    // lecture de la taille de la grille en X
                sizeGrilleY = Integer.parseInt(String.valueOf(ligne.charAt(1)));    // lecture de la taille de la grille en Y
            }
            if((ligne = fichier.readLine()) != null) {
                posX = Integer.parseInt(String.valueOf(ligne.charAt(0)));   // position X de départ
                posY = Integer.parseInt(String.valueOf(ligne.charAt(1)));   // position Y de départ

                switch (ligne.charAt(2)) {
                    case 'E':
                        dir = Direction.E;
                        break;
                    case 'O':
                        dir = Direction.O;
                        break;
                    case 'S':
                        dir = Direction.S;
                        break;
                    default:
                        dir = Direction.N;
                        break;

                }
                Mower Mower_1 = new Mower(posX, posY, dir);             // init la tondeuse 1
                Mower_1.setGrille(sizeGrilleX, sizeGrilleY);

                if ((ligne = fichier.readLine()) != null)                // lecture des déplacements de la tondeuse

                Mower_1.move(ligne);                                  // lance les deplacements de la tondeuse
                System.out.print(Mower_1);                              // affiche la position finale

                if ((ligne = fichier.readLine()) != null) {
                    posX = Integer.parseInt(String.valueOf(ligne.charAt(0)));   // position X de départ
                    posY = Integer.parseInt(String.valueOf(ligne.charAt(1)));   // position Y de départ

                    switch (ligne.charAt(2)) {
                        case 'E':
                            dir = Direction.E;
                            break;
                        case 'O':
                            dir = Direction.O;
                            break;
                        case 'S':
                            dir = Direction.S;
                            break;
                        default:
                            dir = Direction.N;
                            break;

                    }
                    Mower Mower_2 = new Mower(posX, posY, dir);             // init la tondeuse 1
                    Mower_2.setGrille(sizeGrilleX, sizeGrilleY);

                    if ((ligne = fichier.readLine()) != null)                // lecture des déplacements de la tondeuse

                    Mower_2.move(ligne);                                  // lance les deplacements de la tondeuse
                    System.out.print(Mower_2);                              // affiche la position finale

                }
            }
            fichier.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
