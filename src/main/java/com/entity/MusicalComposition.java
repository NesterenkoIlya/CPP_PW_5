package com.entity;

public class MusicalComposition {
    public double duration;    //Длительность
    public int opuses_number;  //Номер опуса
    public String compositor;  //Коипозитор

    public MusicalComposition() {}

    public MusicalComposition(double d, int on, String c) {
        this.duration = d;
        this.opuses_number = on;
        this.compositor = c;
    }

    @Override
    public String toString() {
        return "MusicalComposition{" + "duration=" + duration +
                ", opuses_number=" + opuses_number +
                ", compositor='" + compositor + '\'' +
                '}';
    }

    public double getDuration() { return duration; }

    public int getOpuses_number() { return opuses_number; }

    public String getCompositor() { return compositor; }

    public void setDuration(double duration) { this.duration = duration; }

    public void setCompositor(String compositor) { this.compositor = compositor; }

    public void setOpuses_number(int opuses_number) { this.opuses_number = opuses_number; }
}
