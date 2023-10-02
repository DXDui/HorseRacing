package com.example.prm_teamproject_carracing;

public class User {
    private String username;
    private String password;
    private int money;

    public User(String username, String password, int money) {
        this.username = username;
        this.password = password;
        this.money = money;
    }

    // Các phương thức getter và setter cho các thuộc tính
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void etPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

