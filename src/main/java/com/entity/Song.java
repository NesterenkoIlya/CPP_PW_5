package com.entity;

public class Song extends MusicalComposition {
    protected String song_kind;     //Жанр
    protected String singer;
    protected int verses_number;

    public Song() {}

    public Song (double d, int on, String c, String sk, String s, int vn) {
        this.duration = d;
        this.opuses_number = on;
        this.compositor = c;
        this.song_kind = sk;
        this.singer = s;
        this.verses_number = vn;
    }

    @Override
    public String toString() {
        return "Song{" +
                "duration=" + duration +
                ", opuses_number=" + opuses_number +
                ", compositor='" + compositor + '\'' +
                ", song_kind='" + song_kind + '\'' +
                ", singer='" + singer + '\'' +
                ", verses_number=" + verses_number + '\'' +
                '}';
    }

    public void setSong_kind(String song_kind) { this.song_kind = song_kind; }

    public void setSinger(String singer) { this.singer = singer; }

    public void setVerses_number(int verses_number) { this.verses_number = verses_number; }

    public String getSong_kind() { return song_kind; }

    public String getSinger() { return singer; }

    public int getVerses_number() { return verses_number; }
}
