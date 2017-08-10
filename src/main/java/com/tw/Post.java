package com.tw;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Post")
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PostComment> comments = new ArrayList<>();

    public Post() {
    }

    Post(String title) {
        this.title = title;
    }

    void add(PostComment postComment) {
        comments.add(postComment);
        postComment.setPost(this);
    }
}
