package com.github.prerna.books;

public class Books {
    int id;
    String title;
    String category;
    byte Cover;

   /* public Books(int id, String title, String category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public byte getCover() {
        return Cover;
    }

    public void setCover(byte cover) {
        Cover = cover;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", Cover=" + Cover +
                '}';
    }
}
