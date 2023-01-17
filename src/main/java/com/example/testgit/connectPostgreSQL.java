package com.example.testgit;

import java.sql.*;

public class connectPostgreSQL {
        public Connection Connecting(){
        String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";
        String userName = "postgres";
        String password = "1234";
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("There is connection");
            return connection;
        } catch (SQLException e) {
            System.out.println("Error!!");
            throw new RuntimeException(e);
        }
    }
//    public Connection connect_to_db(String dbname, String user, String password) {
//        Connection conn = null;
//        try {
//            Class.forName("org.postgresql.Driver");
//            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, password);
//            if (conn != null) {
//                System.out.println("Connection Established");
//            } else {
//                System.out.println("Connection Failed");
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return conn;
//    }

        public void select(){
        try
        {
            Connection connection = Connecting();
            String sql = "SELECT \"ID\", \"Name\"\n" + "\tFROM public.\"tableOfTestGit\";";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next())
            {
                System.out.println("ID: "+ resultSet.getString("ID"));
                System.out.println("Name: "+ resultSet.getString("Name"));
                System.out.println();
            }
            statement.close();
            connection.close();
        }
        catch(SQLException e)
        {
            System.out.println("SQL Exception: "+e);
        }
    }
    public void update(){
        try
        {
            Connection connection = Connecting();
            String sql = "UPDATE public.\"tableOfTestGit\"\n" + "\tSET \"Name\"\n" + "\tWHERE \"ID\";";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next())
            {
                System.out.println("ID: "+ resultSet.getString("ID"));
                System.out.println("Name: "+ resultSet.getString("Name"));
                System.out.println();
            }
            statement.close();
            connection.close();
        }
        catch(SQLException e)
        {
            System.out.println("SQL Exception: "+e);
        }
    }
//    public void delete(Connection conn, int id_row) {
//        Statement statement;
//        try {
//            String query = "DELETE FROM tableOfTestGit WHERE id=" + id_row + ";";
//            statement = conn.createStatement();
//            statement.executeUpdate(query);
//            System.out.println("account with id " + id_row + " deleted" + "\n");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//    public void update(Connection conn) {
//        Statement statement;
//        try {
//            String query = "UPDATE tableOfTestGit SET ID = , Name= '' WHERE CustomerID = 1;";
//            statement = conn.createStatement();
//            statement.executeUpdate(query);
//            System.out.println("the row updated" + "\n");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public void viewTable(Connection con) throws SQLException {
//        Statement statement;
//        String query = "select * from tableOfTestGit";
//        try (Statement stmt = con.createStatement()) {
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                String Name = rs.getString("name");
//                int ID = rs.getInt("id");
//                System.out.println(ID + ", " + Name + ".");
//                con.close();
//            }
//        } catch (SQLException e) {
//            System.out.printf("Error!!");
//            throw new RuntimeException(e);
//        }
//    }
}
