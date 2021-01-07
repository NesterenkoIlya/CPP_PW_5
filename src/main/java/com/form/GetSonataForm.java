package com.form;

public class GetSonataForm {
    private int sonata_id;

    public GetSonataForm() {}
    public GetSonataForm(int id) { this.sonata_id = id; }

    public int getSonata_id() {
        return sonata_id;
    }

    public void setSonata_id(int sonata_id) {
        this.sonata_id = sonata_id;
    }
}
