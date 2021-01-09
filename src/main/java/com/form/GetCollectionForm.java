package com.form;

public class GetCollectionForm {
    private int collection_id;

    public GetCollectionForm() {}
    public GetCollectionForm(int id) { this.collection_id = id; }

    public int getCollection_id() { return collection_id; }
    public void setCollection_id(int id) { this.collection_id = id; }
}
