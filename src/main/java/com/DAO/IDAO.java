package com.DAO;

import com.entity.*;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public interface IDAO {

    //add
    public void add_collection(Collection collection);
    public void add_cell(Cell cell);
    public void add_aria(Aria aria);
    public void add_sonata(Sonata sonata);

    //delete
    public void delete_collection(int id);
    public void delete_cell(int id);
    public void delete_aria(int id);
    public void delete_sonata(int id);

    //update
    public void update_collection(int id);
    public void update_cell(int id);
    public void update_aria(int id);
    public void update_sonata(int id);

    //search
    public LinkedList<Collection> search_collection(int id);
    public LinkedList<Cell> search_cell(int id);
    public LinkedList<Aria> search_aria(int id);
    public LinkedList<Sonata> search_sonata(int id);

    //get
    public LinkedList<Collection> get_collection();
    public LinkedList<Cell> get_cell();
    public LinkedList<Aria> get_aria();
    public LinkedList<Sonata> get_sonata();
}
