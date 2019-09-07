package com.reddit.redditdemo.services;
import com.reddit.redditdemo.models.Post;
import com.reddit.redditdemo.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> getAllPost() {
    return postRepository.findAll();
  }

  @Override
  public Post savePost(Post newPost) {
    if (newPost.getName() != null && newPost.getName() != "") {
      return postRepository.save(newPost);
    }
    return null;
  }
}
