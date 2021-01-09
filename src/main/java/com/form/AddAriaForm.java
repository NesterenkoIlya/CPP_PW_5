package com.form;

public class AddAriaForm {
    private int aria_id;
    private double duration;
    private int opuses_number;
    private String compositor;
    private String song_kind;
    private String singer;
    private int verses_number;
    private String volume;
    private String pace;
    private String intonation;
    private int cell_id;

    public AddAriaForm() {}

    public AddAriaForm(int ai, double d, int on, String c, String sk, String s, int vn, String v, String p, String i, int ci) {
        this.aria_id = ai;
        this.duration = d;
        this.opuses_number = on;
        this.compositor = c;
        this.song_kind = sk;
        this.singer = s;
        this.verses_number = vn;
        this.volume = v;
        this.pace = p;
        this.intonation = i;
        this.cell_id = ci;
    }

    //set
    public void setAria_id(int id) { this.aria_id = id; }

    public void setDuration(double duration) { this.duration = duration; }

    public void setCompositor(String compositor) { this.compositor = compositor; }

    public void setOpuses_number(int opuses_number) { this.opuses_number = opuses_number; }

    public void setSong_kind(String song_kind) { this.song_kind = song_kind; }

    public void setSinger(String singer) { this.singer = singer; }

    public void setVerses_number(int verses_number) { this.verses_number = verses_number; }

    public void setVolume(String volume) { this.volume = volume; }

    public void setPace(String pace) { this.pace = pace; }

    public void setIntonation(String intonation) { this.intonation = intonation; }

    public void setCell_id(int cell_id) { this.cell_id = cell_id; }

    //get
    public int getAria_id() { return aria_id; }

    public double getDuration() { return duration; }

    public int getOpuses_number() { return opuses_number; }

    public String getCompositor() { return compositor; }

    public String getSong_kind() { return song_kind; }

    public String getSinger() { return singer; }

    public int getVerses_number() { return verses_number; }

    public String getVolume() { return volume; }

    public String getPace() { return pace; }

    public String getIntonation() { return intonation; }

    public int getCell_id() { return cell_id; }

}