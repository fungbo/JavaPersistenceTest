package com.tw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class HelloService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostCommentRepository postCommentRepository;

    void doAllThings() {
        Post post = new Post("First post");
        PostComment pc1 = new PostComment("First pc");
        pc1.setPost(post);

        PostComment pc2 = new PostComment("Second pc");
        pc2.setPost(post);

        PostComment pc3 = new PostComment("Three pc");
        pc3.setPost(post);

        postCommentRepository.save(pc1);
        postCommentRepository.save(pc2);
        postCommentRepository.save(pc3);
    }

    void remove() {
        postRepository.delete(1L);
    }
}
