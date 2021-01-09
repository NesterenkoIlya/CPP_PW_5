package com.DAO;

import com.entity.*;
import java.util.LinkedList;

public interface IDAO {

    //add
    void add_collection(Collection collection);
    void add_cell(Cell cell);
    void add_aria(Aria aria);
    void add_sonata(Sonata sonata);

    //delete
    void delete_collection(int id);
    void delete_cell(int id);
    void delete_aria(int id);
    void delete_sonata(int id);

    //update
    void update_collection(int id);
    void update_cell(int id);
    void update_aria(int id);
    void update_sonata(int id);

    //search
    LinkedList<Collection> search_collection(int id);
    LinkedList<Cell> search_cell(int id);
    LinkedList<Aria> search_aria(int id);
    LinkedList<Sonata> search_sonata(int id);

    //get
    LinkedList<Collection> get_collection();
    LinkedList<Cell> get_cell();
    LinkedList<Aria> get_aria();
    LinkedList<Sonata> get_sonata();
}
