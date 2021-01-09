package com.entity;

public class Collection {
    private int collection_id;
    private String name;

    public Collection(int ci, String n) {
        this.collection_id = ci;
        this.name = n;
    }

    @Override
    public String toString() {
        return "Collection{" + "collection_id=" + collection_id +
                ", name='" + name + '\'' +
                '}';
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
