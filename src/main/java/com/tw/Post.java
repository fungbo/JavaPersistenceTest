package com.tw;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity(name = "Post")
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    @CollectionTable(name = "post_comment")
    @ElementCollection(targetClass = PostComment.class)
    Collection<PostComment> comments;

    public Post() {
    }

    Post(String title) {
        this.title = title;
    }

    void addComment(PostComment comment) {
        if (comments == null) {
            comments = new ArrayList<>();
        }
        comments.add(comment);
    }
}
