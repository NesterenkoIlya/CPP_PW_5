package com.form;

public class GetCellForm {
    private int cell_id;

    public GetCellForm() {}
    public GetCellForm(int id) { this.cell_id = id; }

    public int get_cell_id() { return cell_id; }
    public void set_cell_id(int id) { this.cell_id = id; }
}
