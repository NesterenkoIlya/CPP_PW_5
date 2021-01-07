package com.form;

public class DeleteCellForm {
    private int cell_id;

    public DeleteCellForm() {}
    public DeleteCellForm(int id) { this.cell_id = id; }

    public int get_cell_id() { return cell_id; }
    public void set_cell_id(int id) { this.cell_id = id; }
}
