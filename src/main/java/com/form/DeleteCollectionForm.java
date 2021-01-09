package com.form;

public class DeleteCollectionForm {
    private int collection_id;

    public DeleteCollectionForm() {}
    public DeleteCollectionForm(int id) { this.collection_id = id; }

    public int getCollection_id() { return collection_id; }
    public void setCollection_id(int id) { this.collection_id = id; }
}
