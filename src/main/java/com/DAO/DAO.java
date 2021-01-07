package com.DAO;

import com.entity.*;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DAO implements IDAO {
    private static final String url = "jdbc:mysql://localhost:3306/musical_composition?useUnicode=true&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "guvelu12";
    private Connection connection;
    private Scanner in = new Scanner(System.in);

    public DAO() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void add_collection(Collection collection) {
        try {
            PreparedStatement add = null;
            add = connection.prepareStatement("insert into collection(collection_id, name) values(?, ?)");
            add.setInt(1, collection.get_collection_id());
            add.setString(2, collection.get_name());
            add.executeUpdate();
            add.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void add_cell(Cell cell) {
        try {
            PreparedStatement add = connection.prepareStatement("insert into cell(cell_id, copies_number, collection_id) values(?, ?, ?)");
            add.setInt(1, cell.get_cell_id());
            add.setInt(2, cell.get_copies_number());
            add.setInt(3, cell.get_collection_id());
            add.executeUpdate();
            add.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void add_aria(Aria aria) {
        try {
            PreparedStatement add = connection.prepareStatement("insert into aria(aria_id, duration, opuses_number, compositor, song_kind, singer, verses_number, volume, pace, intonation, cell_id) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            add.setInt(1, aria.get_aria_id());
            add.setDouble(2, aria.get_duration());
            add.setInt(3, aria.get_opuses_number());
            add.setString(4, aria.get_compositor());
            add.setString(5, aria.get_song_kind());
            add.setString(6, aria.get_singer());
            add.setInt(7, aria.get_verses_number());
            add.setString(8, aria.get_volume());
            add.setString(9, aria.get_pace());
            add.setString(10, aria.get_intonation());
            add.setInt(11, aria.get_cell_id());
            add.executeUpdate();
            add.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void add_sonata(Sonata sonata) {
        try {
            PreparedStatement add = connection.prepareStatement("insert into sonata(sonata_id, duration, opuses_number, compositor, part_number, application, cell_id) values(?, ?, ?, ?, ?, ?, ?)");
            add.setInt(1, sonata.get_sonata_id());
            add.setDouble(2, sonata.get_duration());
            add.setInt(3, sonata.get_opuses_number());
            add.setString(4, sonata.get_compositor());
            add.setInt(5, sonata.get_part_number());
            add.setString(6, sonata.get_application());
            add.setInt(7, sonata.get_cell_id());
            add.executeUpdate();
            add.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete_collection(int id) {
        try {
            PreparedStatement delete = connection.prepareStatement("delete from collection where collection_id=?");
            delete.setInt(1,id);
            delete.executeUpdate();
            delete.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete_cell(int id) {
        try {
            PreparedStatement delete = connection.prepareStatement("delete from cell where cell_id=?");
            delete.setInt(1,id);
            delete.executeUpdate();
            delete.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete_aria(int id) {
        try {
            PreparedStatement delete = connection.prepareStatement("delete from aria where aria_id=?");
            delete.setInt(1,id);
            delete.executeUpdate();
            delete.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete_sonata(int id) {
        try {
            PreparedStatement delete = connection.prepareStatement("delete from sonata where sonata_id=?");
            delete.setInt(1,id);
            delete.executeUpdate();
            delete.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update_collection(int id) {
        try {
            PreparedStatement update;
            System.out.println("Enter column id: ");
            int column = in.nextInt();
            if (column == 2) {
                update = connection.prepareStatement("update collection set name = ? where collection_id = ?");
                System.out.print("Enter collection name: ");
                String name = in.nextLine();
                update.setString(1, name);
                update.setInt(2, id);
                update.executeUpdate();
                update.close();
            } else {
                System.out.println("You use incorrect column or row id!");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update_cell(int id) {
        try {
            PreparedStatement update;
            System.out.println("Enter column id: ");
            int column = in.nextInt();
            switch (column) {
                case 2: {
                    update = connection.prepareStatement("update cell set copies_number = ? where cell_id = ?");
                    System.out.print("Enter copies_number: ");
                    int copies_number = in.nextInt();
                    update.setInt(1, copies_number);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 3: {
                    update = connection.prepareStatement("update cell set collection_id = ? where cell_id = ?");
                    System.out.print("Enter collection_id: ");
                    int collection_id = in.nextInt();
                    update.setInt(1, collection_id);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                default:
                    System.out.println("You use incorrect column or row id!");
                    break;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update_aria(int id) {
        try {
            PreparedStatement update;
            System.out.println("Enter column id: ");
            int column = in.nextInt();
            switch (column) {
                case 2: {
                    update = connection.prepareStatement("update aria set duration = ? where aria_id = ?");
                    System.out.print("Enter duration: ");
                    double duration = in.nextDouble();
                    update.setDouble(1, duration);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 3: {
                    update = connection.prepareStatement("update aria set opuses_number = ? where aria_id = ?");
                    System.out.print("Enter opuses_number: ");
                    int opuses_number = in.nextInt();
                    update.setInt(1, opuses_number);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 4: {
                    update = connection.prepareStatement("update aria set compositor = ? where aria_id = ?");
                    System.out.print("Enter compositor: ");
                    String compositor = in.nextLine();
                    update.setString(1, compositor);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 5: {
                    update = connection.prepareStatement("update aria set song_kind = ? where aria_id = ?");
                    System.out.print("Enter song_kind: ");
                    String song_kind = in.nextLine();
                    update.setString(1, song_kind);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 6: {
                    update = connection.prepareStatement("update aria set singer = ? where aria_id = ?");
                    System.out.print("Enter singer: ");
                    String singer = in.nextLine();
                    update.setString(1, singer);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 7: {
                    update = connection.prepareStatement("update aria set verses_number = ? where aria_id = ?");
                    System.out.print("Enter verses_number: ");
                    int verses_number = in.nextInt();
                    update.setInt(1, verses_number);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 8: {
                    update = connection.prepareStatement("update aria set volume = ? where aria_id = ?");
                    System.out.print("Enter volume: ");
                    String volume = in.nextLine();
                    update.setString(1, volume);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 9: {
                    update = connection.prepareStatement("update aria set pace = ? where aria_id = ?");
                    System.out.print("Enter pace: ");
                    String pace = in.nextLine();
                    update.setString(1, pace);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 10: {
                    update = connection.prepareStatement("update aria set intonation = ? where aria_id = ?");
                    System.out.print("Enter intonation: ");
                    String intonation = in.nextLine();
                    update.setString(1, intonation);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 11: {
                    update = connection.prepareStatement("update aria set cell_id = ? where aria_id = ?");
                    System.out.print("Enter cell_id: ");
                    int cell_id = in.nextInt();
                    update.setInt(1, cell_id);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                default:
                    System.out.println("You use incorrect column or row id!");
                    break;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update_sonata(int id) {
        try {
            PreparedStatement update;
            System.out.println("Enter column id: ");
            int column = in.nextInt();
            switch (column) {
                case 2: {
                    update = connection.prepareStatement("update sonata set duration = ? where sonata_id = ?");
                    System.out.print("Enter duration: ");
                    double duration = in.nextDouble();
                    update.setDouble(1, duration);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 3: {
                    update = connection.prepareStatement("update sonata set opuses_number = ? where sonata_id = ?");
                    System.out.print("Enter opuses_number: ");
                    int opuses_number = in.nextInt();
                    update.setInt(1, opuses_number);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 4: {
                    update = connection.prepareStatement("update sonata set compositor = ? where sonata_id = ?");
                    System.out.print("Enter compositor: ");
                    String compositor = in.nextLine();
                    update.setString(1, compositor);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 5: {
                    update = connection.prepareStatement("update sonata set part_number = ? where sonata_id = ?");
                    System.out.print("Enter part_number: ");
                    int part_number = in.nextInt();
                    update.setInt(1, part_number);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 6: {
                    update = connection.prepareStatement("update sonata set application = ? where sonata_id = ?");
                    System.out.print("Enter application: ");
                    String application = in.nextLine();
                    update.setString(1, application);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                case 7: {
                    update = connection.prepareStatement("update sonata set cell_id = ? where sonata_id = ?");
                    System.out.print("Enter cell_id: ");
                    int cell_id = in.nextInt();
                    update.setInt(1, cell_id);
                    update.setInt(2, id);
                    update.executeUpdate();
                    update.close();
                }
                default:
                    System.out.println("You use incorrect column or row id!");
                    break;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public LinkedList<Collection> search_collection(int id) {
        LinkedList<Collection> list = null;
        try {
            PreparedStatement search;
            ResultSet rs;

            search = connection.prepareStatement("select * from collection where collection_id = ?");
            search.setInt(1, id);

            rs = search.executeQuery();

            while (rs.next()) {
                Collection c = new Collection(
                    rs.getInt(1),
                    rs.getString(2)
                );
                list.add(c);
                System.out.println(c);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public LinkedList<Cell> search_cell(int id) {
        LinkedList<Cell> list = null;
        try {
            PreparedStatement search;
            ResultSet rs;

            search = connection.prepareStatement("select * from cell where cell_id = ?");
            search.setInt(1, id);

            rs = search.executeQuery();

            while (rs.next()) {
                Cell c = new Cell(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3)
                );
                list.add(c);
                System.out.println(c);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public LinkedList<Aria> search_aria(int id) {
        LinkedList<Aria> list = null;
        try {
            PreparedStatement search;
            ResultSet rs;

            search = connection.prepareStatement("select * from aria where aria_id = ?");

            search.setInt(1, id);

            rs = search.executeQuery();

            while (rs.next()) {
                Aria a = new Aria(
                        rs.getInt(1),
                        rs.getDouble(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11)
                );
                list.add(a);
                System.out.println(a);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public LinkedList<Sonata> search_sonata(int id) {
        LinkedList<Sonata> list = null;
        try {
            PreparedStatement search;
            ResultSet rs;

            search = connection.prepareStatement("select * from sonata where sonata_id = ?");

            search.setInt(1, id);

            rs = search.executeQuery();

            while (rs.next()) {
                Sonata s = new Sonata(
                        rs.getInt(1),
                        rs.getDouble(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7)
                );
                list.add(s);
                System.out.println(s);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public LinkedList<Collection> get_collection() {
        LinkedList<Collection> list = null;
        try {
            PreparedStatement get = connection.prepareStatement("select * from collection");

            ResultSet rs = get.executeQuery();

            while (rs.next()) {
                int a = rs.getInt(1);
                String b = rs.getString(2);
                Collection c = new Collection(a, b);
                list.add(c);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public LinkedList<Cell> get_cell() {
        LinkedList<Cell> list = null;
        try {
            PreparedStatement get = connection.prepareStatement("select * from cell");

            ResultSet rs = get.executeQuery();

            while (rs.next()) {
                int a = rs.getInt(1);
                int b = rs.getInt(2);
                int c = rs.getInt(3);
                Cell cell = new Cell(a, b, c);
                list.add(cell);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public LinkedList<Aria> get_aria() {
        LinkedList<Aria> list = null;
        try {
            PreparedStatement get = connection.prepareStatement("select * from aria");

            ResultSet rs = get.executeQuery();

            while (rs.next()) {
                int a = rs.getInt(1);
                double b = rs.getDouble(2);
                int c = rs.getInt(3);
                String d = rs.getString(4);
                String e = rs.getString(5);
                String f = rs.getString(6);
                int g = rs.getInt(7);
                String h = rs.getString(8);
                String i = rs.getString(9);
                String j = rs.getString(10);
                int k = rs.getInt(11);
                Aria aria = new Aria(a, b, c, d, e, f, g, h, i, j, k);
                list.add(aria);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public LinkedList<Sonata> get_sonata() {
        LinkedList<Sonata> list = null;
        try {
            PreparedStatement get = connection.prepareStatement("select * from sonata");

            ResultSet rs = get.executeQuery();

            while (rs.next()) {
                int a = rs.getInt(1);
                double b = rs.getDouble(2);
                int c = rs.getInt(3);
                String d = rs.getString(4);
                int e = rs.getInt(5);
                String f = rs.getString(6);
                int g = rs.getInt(7);
                Sonata s = new Sonata(a, b, c, d, e, f, g);
                list.add(s);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
