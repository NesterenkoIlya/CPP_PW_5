package com.form;

public class AddSonataForm {
    public int sonata_id;
    public double duration;
    public int opuses_number;
    public String compositor;
    public int part_number;    //Количество частей
    public String application; //Применение
    public int cell_id;

    public AddSonataForm() {};
    public AddSonataForm(int si, double d, int on, String c, int pn, String a, int ci) {
        this.sonata_id = si;
        this.duration = d;
        this.opuses_number = on;
        this.compositor = c;
        this.part_number = pn;
        this.application = a;
        this.cell_id = ci;
    }

    public void setSonata_id(int sonata_id) {
        this.sonata_id = sonata_id;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setOpuses_number(int opuses_number) {
        this.opuses_number = opuses_number;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public void setPart_number(int part_number) {
        this.part_number = part_number;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public void setCell_id(int cell_id) {
        this.cell_id = cell_id;
    }

    public int getSonata_id() {
        return sonata_id;
    }

    public double getDuration() {
        return duration;
    }

    public int getOpuses_number() {
        return opuses_number;
    }

    public String getCompositor() {
        return compositor;
    }

    public int getPart_number() {
        return part_number;
    }

    public String getApplication() {
        return application;
    }

    public int getCell_id() {
        return cell_id;
    }
}
