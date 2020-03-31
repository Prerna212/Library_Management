package com.github.prerna.users;

import java.util.Date;

public class Users {
     int user_id;
     String name;
     String book_issues;
     int fine;
     Date return_date;
     int id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook_issues() {
        return book_issues;
    }

    public void setBook_issues(String book_issues) {
        this.book_issues = book_issues;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

