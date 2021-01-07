package com.form;

public class DeleteCollectionForm {
    private int collection_id;

    public DeleteCollectionForm() {}
    public DeleteCollectionForm(int id) { this.collection_id = id; }

    public int get_collection_id() { return collection_id; }
    public void set_collection_id(int id) { this.collection_id = id; }
}
