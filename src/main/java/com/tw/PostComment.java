package com.tw;

import javax.persistence.*;

@Entity(name = "PostComment")
@Table(name = "post_comment")
class PostComment {

    @Id
    @GeneratedValue
    private long id;

    private String review;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Post post;

    public PostComment() {
    }

    public PostComment(String review) {
        this.review = review;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
