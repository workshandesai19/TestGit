package com.example.testgit;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class Person{
    private int ID;
    private String Name;

    public Person(int ID, String name) {
        this.ID = ID;
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                '}';
    }
}



public class listOfData {
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

    public List<Person> select(){
        List <Person> person_List = new ArrayList<>();
        try
        {
            Connection connection = Connecting();
            System.out.println("select_connection");
            String sql = "SELECT * FROM public.\"tableOfTestGit\";";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next())
            {
                Person person = new Person( resultSet.getInt("ID") , resultSet.getString("Name"));
                person_List.add(person);
                System.out.println();
            }
            statement.close();
            connection.close();
        }
        catch(SQLException e)
        {
            System.out.println("SQL Exception: "+e);
        }
        return person_List;
    }
    public List<Person> update(String update_name, int where_id){
        List <Person> person_List_Update = new ArrayList<>();
        System.out.println("Enter new name and ID");
        String sql = "UPDATE public.\"tableOfTestGit\"" +
                "\tSET \"Name\"=?" +
                "\tWHERE \"ID\"=?";
        try {
            Connection connection = Connecting();
            System.out.println("update_connection");
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, update_name);
            statement.setInt(2, where_id);
            statement.executeUpdate();
            for (:
                 ) {
                
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e);
        }
        return person_List_Update;
    }
}
