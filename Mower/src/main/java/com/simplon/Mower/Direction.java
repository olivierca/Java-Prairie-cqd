package com.simplon.Mower;

public enum Direction{
    N("N",0),E("E",90),S("S",180),O("O",270);

    private final String dir;
    private final int angle;

    Direction(String dir,int angle)
    {
        this.dir = dir;
        this.angle = angle;
    }

    public Direction getdir(int angle)
    {
        if(Direction.E.angle == angle) return Direction.E;
        if(Direction.O.angle == angle) return Direction.O;
        if(Direction.N.angle == angle) return Direction.N;
        return Direction.S;
    }

    public int getangle()
    {
        return angle;
    }

    @Override
    public String toString() {return dir;}

}
