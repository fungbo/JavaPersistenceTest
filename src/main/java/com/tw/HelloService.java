package com.tw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class HelloService {

    @Autowired
    private PostRepository postRepository;

    void doAllThings() {
        Post post = new Post("First post");
        post.add(new PostComment("First review"));
        post.add(new PostComment("Second review"));
        post.add(new PostComment("Third review"));
        postRepository.save(post);
    }

    void remove() {
        postRepository.delete(1L);
    }
}
