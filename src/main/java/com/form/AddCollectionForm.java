package com.form;

public class AddCollectionForm {
    private int collection_id;
    private String name;

    public AddCollectionForm() {}

    public AddCollectionForm(int ci, String n) {
        this.collection_id = ci;
        this.name = n;
    }

    public int getCollection_id() {
        return collection_id;
    }

    public String getName() {
        return name;
    }

    public void setCollection_id(int collection_id) {
        this.collection_id = collection_id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
