package com.DAO;

import java.sql.*;

public class DAOFactory {

    public static IDAO getDAOInstance(TypeDAO type) throws SQLException {
        IDAO dao = null;
        if (type == TypeDAO.MySQL) { dao = new DAO(); }
        if (type == TypeDAO.COLLECTION) { dao = new DAOCol(); }
        return dao;
    }

}
