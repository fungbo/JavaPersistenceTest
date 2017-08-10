package com.tw;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Post")
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    public Post() {
    }

    Post(String title) {
        this.title = title;
    }
}
