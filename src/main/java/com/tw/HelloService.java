package com.tw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class HelloService {

    @Autowired
    private PostRepository postRepository;

    void doAllThings() {
        Post post = new Post("First post");
        PostComment pc1 = new PostComment("First pc");
        PostComment pc2 = new PostComment("Second pc");
        PostComment pc3 = new PostComment("Three pc");
        post.addComment(pc1);
        post.addComment(pc2);
        post.addComment(pc3);

        postRepository.save(post);
    }

    void remove() {
        postRepository.delete(1L);
    }
}
