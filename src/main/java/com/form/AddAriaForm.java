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
    public void set_aria_id(int id) { this.aria_id = id; }

    public void set_duration(double duration) { this.duration = duration; }

    public void set_compositor(String compositor) { this.compositor = compositor; }

    public void set_opuses_number(int opuses_number) { this.opuses_number = opuses_number; }

    public void set_song_kind(String song_kind) { this.song_kind = song_kind; }

    public void set_singer(String singer) { this.singer = singer; }

    public void set_verses_number(int verses_number) { this.verses_number = verses_number; }

    public void set_volume(String volume) { this.volume = volume; }

    public void set_pace(String pace) { this.pace = pace; }

    public void set_intonation(String intonation) { this.intonation = intonation; }

    public void set_cell_id(int cell_id) { this.cell_id = cell_id; }

    //get
    public int get_aria_id() { return aria_id; }

    public double get_duration() { return duration; }

    public int get_opuses_number() { return opuses_number; }

    public String get_compositor() { return compositor; }

    public String get_song_kind() { return song_kind; }

    public String get_singer() { return singer; }

    public int get_verses_number() { return verses_number; }

    public String get_volume() { return volume; }

    public String get_pace() { return pace; }

    public String get_intonation() { return intonation; }

    public int get_cell_id() { return cell_id; }

}