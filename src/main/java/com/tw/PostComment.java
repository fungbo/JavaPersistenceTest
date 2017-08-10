package com.tw;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "PostComment")
@Table(name = "post_comment")
class PostComment {

    @Id
    @GeneratedValue
    private long id;

    private String review;

    public PostComment(String review) {
        this.review = review;
    }
}
