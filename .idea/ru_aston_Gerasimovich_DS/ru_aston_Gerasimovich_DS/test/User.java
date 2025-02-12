package ru_aston_Gerasimovich_DS.test;

public class User {
    int id;
    String name;
    String email;
    String password;

    User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void getUserId() {
        this.id = id;
    }
}
