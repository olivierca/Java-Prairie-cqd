package com.simplon.Library;


import org.omg.CORBA.Object;

public class DVD {

    private Movie kind;
    private String title="";
    private int time=0;
    private boolean f3D=false;

    public DVD(String title,int time,Movie kind,boolean f3D ){
        this.title = title;
        this.time = time;
        this.kind = kind;
        this.f3D = f3D;
    }

    public String getNom(){return title;}

    public boolean equals(DVD obj) {
        if(this.title != obj.title) return false;
        if(this.kind != obj.kind) return false;
        if(this.time != obj.time) return false;
        if(this.f3D != obj.f3D) return false;
        return true;
    }
}
