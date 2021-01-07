package com.form;

public class AddCollectionForm {
    private int collection_id;
    private String name;

    public AddCollectionForm() {}
    public AddCollectionForm(int ci, String n) {
        this.collection_id = ci;
        this.name = n;
    }

    public int get_collection_id() {
        return collection_id;
    }

    public String get_name() {
        return name;
    }

    public void set_collection_id(int collection_id) {
        this.collection_id = collection_id;
    }

    public void set_name(String name) {
        this.name = name;
    }
}
