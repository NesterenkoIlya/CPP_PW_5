package com.form;

public class AddCellForm {
    private int cell_id;
    private int collection_id;
    private int copies_number;

    public AddCellForm() {}
    public AddCellForm(int ci, int cn, int coli) {
        this.cell_id = ci;
        this.collection_id = coli;
        this.copies_number = cn;
    }

    public int getCell_id() { return cell_id; }

    public int getCollection_id() { return collection_id; }

    public int getCopies_number() { return copies_number; }

    public void setCell_id(int cell_id) { this.cell_id = cell_id; }

    public void setCollection_id(int collection_id) { this.collection_id = collection_id; }

    public void setCopies_number(int copies_number) { this.copies_number = copies_number; }
}
