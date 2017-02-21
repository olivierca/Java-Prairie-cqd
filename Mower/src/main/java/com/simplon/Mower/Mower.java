package com.simplon.Mower;

import java.util.ArrayList;

public class Mower {
    private static final int minGrille = 0;
    private static final int degre = 90;
    private int maxGrilleX = 5;
    private int maxGrilleY = 5;
    private int posX=0;
    private int posY=0;
    private int angle=0;
    private Direction mDir;

    public Mower(int x, int y, Direction dir)
    {
        posX = x;
        posY = y;
        mDir = dir;
        angle = mDir.getangle();
    }

    // Dimentionne la grille
    public void setGrille(int grillex, int grilley)
    {
        maxGrilleX = grillex;
        maxGrilleY = grilley;
    }

    // execute les déplacements de la tondeuse
    public void move(ArrayList<Move> moves) {
        for (Move dir : moves) {
            switch (dir.getdir()) {
                case 'F':         // déplacement
                    switch (mDir) {
                        case N:
                            if (posY < maxGrilleY) posY++;
                            break;
                        case E:
                            if (posX < maxGrilleX) posX++;
                            break;
                        case S:
                            if (posY > minGrille) posY--;
                            break;
                        case O:
                            if (posX > minGrille) posX--;
                            break;
                    }
                    break;
                case 'L':         // tourne à gauche
                    angle -= degre;
                    if (angle < 0) angle = Direction.valueOf("O").getangle();
                    break;
                case 'R':         // tourne à droite
                    angle += degre;
                    if (angle > Direction.valueOf("O").getangle()) angle = 0;
                    break;
                default:
                    break;
            }
            mDir = mDir.getdir(angle);      // mise à jour de la direction
        }
    }

    @Override
    public String toString()
    {
        return posX+""+posY+mDir.toString()+" ";
    }
}
