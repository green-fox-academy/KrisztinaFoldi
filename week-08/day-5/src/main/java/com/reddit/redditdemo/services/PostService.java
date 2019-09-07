package com.reddit.redditdemo.services;
import com.reddit.redditdemo.models.Post;
import java.util.List;

public interface PostService {
  List<Post> getAllPost();
  Post savePost(Post post);
}
