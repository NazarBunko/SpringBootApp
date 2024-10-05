package spring.boot.app;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {
    private int id;
    private String name;
    private String author;

    public Course(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }
}
