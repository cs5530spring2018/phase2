package cs5530;

import java.lang.*;
import java.sql.*;
import java.io.*;
//import javax.servlet.http.*;

public class UserService {
    // userType 0 is UberUser
    // userType 1 is UberDriver
    public UserService() { }

    public boolean createUberUser(Statement stmt, String login, String password, String name, String address, String phone) {
        this.createUser(stmt, login, password, name, address, phone, 0);
    }

    public boolean createUberDriver(Statement stmt, String login, String password, String name, String address, String phone) {
        this.createUser(stmt, login, password, name, address, phone, 1);
    }

    private boolean createUser(Statement stmt, String login, String password, String name, String address, String phone, Int userType) {
        String query;
        String table;

        if (userType == 0) {
            table = "UberUser";
        }
        else if (userType == 1) {
            table = "UberDriver";
        }
        else {
            return false;
        }

        try {
            for
            query = "INSERT INTO " + table + "(login, password, name, address, phone)" +
                    "VALUES (" + login + ", " + password + ", " + name + ", " + address + ", " + "phone);";

            results = stmt.executeQuery(query);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println ("Could not create new user: " + e.getMessage());
            e.throw()
        }
        return false;
    }
}