package com.DAO;

import com.entity.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DAOCol implements IDAO {
    private static LinkedList<Aria> _aria = new LinkedList<Aria>();
    private static LinkedList<Cell> _cell = new LinkedList<Cell>();
    private static LinkedList<Collection> _collection = new LinkedList<Collection>();
    private static LinkedList<Sonata> _sonata = new LinkedList<Sonata>();
    private Scanner in = new Scanner(System.in);

    static {
            _collection.add(new Collection(1, "Big Collection"));
            _cell.add(new Cell(1, 12, 1));
            _cell.add(new Cell(2, 16, 1));
            _aria.add(new Aria(1, 2.2, 3, "Random", "Huiweb", "Kjgopiew", 4, "Kishjd", "Kdjwq", "Loiwef", 1));
            _sonata.add(new Sonata(1, 3.4, 5, "Kihwe", 4, "Kijdio", 2));
            _collection.add(new Collection(2, "Small Collection"));
            _cell.add(new Cell(3, 52, 2));
            _cell.add(new Cell(4, 25, 2));
            _sonata.add(new Sonata(2, 3.2, 6, "Fsdh", 4, "Bwefw", 3));
            _aria.add(new Aria(2, 4.2, 8, "Btrwes", "Qdfh", "Nehtr", 6, "Kishjd", "Kdjwq", "Loiwef", 4));
            _cell.add(new Cell(5, 3, 2));
            _aria.add(new Aria(3, 6.2, 6, "Kofjwpe", "Askoplf", "Moew", 4, "Lodsw", "Lcwet", "Lfnw", 4));
    }


    @Override
    public void add_collection(Collection collection) {
        _collection.add(collection);
    }

    @Override
    public void add_cell(Cell cell) {
        _cell.add(cell);
    }

    @Override
    public void add_aria(Aria aria) {
        _aria.add(aria);
    }

    @Override
    public void add_sonata(Sonata sonata) {
        _sonata.add(sonata);
    }

    @Override
    public void delete_collection(int id) {
        for (Collection o : _collection)
            if (o.get_collection_id() == id)
                _collection.remove(o);
    }

    @Override
    public void delete_cell(int id) {
        for (Cell o : _cell)
            if (o.get_cell_id() == id)
                _cell.remove(o);
    }

    @Override
    public void delete_aria(int id) {
        for (Aria o : _aria)
            if (o.get_aria_id() == id)
                _aria.remove(o);
    }

    @Override
    public void delete_sonata(int id) {
        for (Sonata o : _sonata)
            if (o.get_sonata_id() == id)
                _sonata.remove(o);
    }

    @Override
    public void update_collection(int id) {
        System.out.print("Enter name:");
        String name = in.nextLine();
        Collection c = new Collection(id, name);
        int i = 0;
        for (Collection o : _collection) {
            if (o.get_collection_id() == id)
                break;
            i++;
        }
        _collection.set(i, c);
    }

    @Override
    public void update_cell(int id) {
        System.out.print("Enter copies_number:");
        int c_n = in.nextInt();
        System.out.print("Enter collection_id:");
        int c_i = in.nextInt();
        int i = 0;
        Cell c = new Cell(id, c_n, c_i);
        for (Cell o : _cell) {
            if (o.get_cell_id() == id)
                break;
            i++;
        }
        _cell.set(i, c);
    }

    @Override
    public void update_aria(int id) {
        System.out.print("Enter duration:"); double dur = in.nextDouble();
        System.out.print("Enter opuses_number:"); int on = in.nextInt();
        System.out.print("Enter compositor:"); String comp = in.nextLine();
        System.out.print("Enter song_kind:"); String sk = in.nextLine();
        System.out.print("Enter singer:"); String sin = in.nextLine();
        System.out.print("Enter verses_number:"); int vn = in.nextInt();
        System.out.print("Enter volume:"); String vol = in.nextLine();
        System.out.print("Enter pace:"); String p = in.nextLine();
        System.out.print("Enter intonation:"); String inton = in.nextLine();
        System.out.print("Enter cell_id:"); int cid = in.nextInt();

        int i = 0;
        Aria a = new Aria(id, dur, on, comp, sk, sin, vn, vol, p, inton, cid);
        for (Aria o : _aria) {
            if (o.get_aria_id() == id)
                break;
            i++;
        }
        _aria.set(i, a);
    }

    @Override
    public void update_sonata(int id) {
        System.out.print("Enter duration:"); double dur = in.nextDouble();
        System.out.print("Enter opuses_number:"); int on = in.nextInt();
        System.out.print("Enter compositor:"); String comp = in.nextLine();
        System.out.print("Enter part_number:"); int pn = in.nextInt();
        System.out.print("Enter application:"); String appl = in.nextLine();
        System.out.print("Enter cell_id:"); int cid = in.nextInt();

        int i = 0;
        Sonata s = new Sonata(id, dur, on, comp, pn, appl, cid);
        for (Sonata o : _sonata) {
            if (o.get_sonata_id() == id)
                break;
            i++;
        }
        _sonata.set(i, s);
    }

    @Override
    public LinkedList<Collection> search_collection(int id) {
        LinkedList<Collection> list = null;
        for (Collection o : _collection)
            if (o.get_collection_id() == id)
                list.add(o);
        return list;
    }

    @Override
    public LinkedList<Cell> search_cell(int id) {
        LinkedList<Cell> list = null;
        for (Cell o : _cell)
            if (o.get_cell_id() == id)
                list.add(o);
        return list;
    }

    @Override
    public LinkedList<Aria> search_aria(int id) {
        LinkedList<Aria> list = null;
        for (Aria o : _aria)
            if (o.get_aria_id() == id)
                list.add(o);
        return list;
    }

    @Override
    public LinkedList<Sonata> search_sonata(int id) {
        LinkedList<Sonata> list = new LinkedList<>();
        for (Sonata o : _sonata)
            if (o.get_sonata_id() == id)
                list.add(o);
        return list;
    }

    @Override
    public LinkedList<Collection> get_collection() {
        return _collection;
    }

    @Override
    public LinkedList<Cell> get_cell() {
        return _cell;
    }

    @Override
    public LinkedList<Aria> get_aria() {
        return _aria;
    }

    @Override
    public LinkedList<Sonata> get_sonata() {
        return _sonata;
    }

    public static void main(String[] args) throws SQLException {
        IDAO dao = DAOFactory.getDAOInstance(TypeDAO.COLLECTION);
        LinkedList<Aria> list = dao.get_aria();
        System.out.println(list);
        Aria a = new Aria(5, 2.2, 7, "Random", "Huiweb", "AGEds", 4, "Kishjd", "Kdjwq", "Loiwef", 1);
        Aria b = new Aria(6, 3.2, 3, "Random", "Hdsyr", "Kjgopiew", 4, "GBE$w", "Kdjwq", "Loiwef", 1);
        dao.add_aria(a);
        dao.add_aria(b);
        dao.delete_aria(5);
        list = dao.search_aria(6);
        System.out.println(list);
    }
}
