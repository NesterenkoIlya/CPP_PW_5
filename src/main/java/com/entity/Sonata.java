package com.entity;

public class Sonata extends MusicalComposition {
    public int sonata_id;
    public int part_number;    //Количество частей
    public String application; //Применение
    public int cell_id;

    public Sonata(int si, double d, int on, String c, int pn, String a, int ci) {
        this.sonata_id = si;
        this.duration = d;
        this.opuses_number = on;
        this.compositor = c;
        this.part_number = pn;
        this.application = a;
        this.cell_id = ci;
    }

    @Override
    public String toString() {
        return "Sonata{" + "sonata_id=" + sonata_id + '\'' +
                ", duration=" + duration + '\'' +
                ", opuses_number=" + opuses_number + '\'' +
                ", compositor='" + compositor + '\'' +
                ", part_number=" + part_number + '\'' +
                ", application='" + application + '\'' +
                ", cell_id='" + cell_id + '\'' +
                '}';
    }

    public void setPart_number(int part_number) { this.part_number = part_number; }

    public void setApplication(String application) { this.application = application; }

    public void setSonata_id(int sonata_id) { this.sonata_id = sonata_id; }

    public void setCell_id(int cell_id) { this.cell_id = cell_id; }

    public int getPart_number() { return part_number; }

    public String getApplication() { return application; }

    public int getSonata_id() { return sonata_id; }

    public int getCell_id() { return cell_id; }
}
