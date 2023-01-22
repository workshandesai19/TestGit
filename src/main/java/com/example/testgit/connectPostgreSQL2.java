package com.example.testgit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class connectPostgreSQL2 {
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

    public void select(){
        try
        {
            Connection connection = Connecting();
            System.out.println("select_connection");
            String sql = "SELECT * FROM public.\"tableOfTestGit\";";
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
    public void insert(String new_name, int wher_id){
        String sql = "INSERT INTO public.\"tableOfTestGit\"(" +
                "\"ID\", \"Name\")" +
                "VALUES (?, ?);";
        try
        {
            Connection connection = Connecting();
            System.out.println("insert_connection");
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, wher_id);
            statement.setString(2, new_name);
            int resultSet = statement.executeUpdate();
            statement.close();
            connection.close();
        }
        catch(SQLException e)
        {

            System.out.println("SQL Exception: "+e);
        }
    }
    public void update(String update_name, int where_id){
        System.out.println("Enter new name and ID");
        String sql = "UPDATE public.\"tableOfTestGit\"" +
                "\tSET \"Name\"=?" +
                "\tWHERE \"ID\"=?";
        try
        {
            Connection connection = Connecting();
            System.out.println("update_connection");
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, update_name);
            statement.setInt(2, where_id);
            statement.executeUpdate();
            statement.close();
            connection.close();
        }
        catch(SQLException e)
        {
            System.out.println("SQL Exception: "+e);
        }
    }
}
