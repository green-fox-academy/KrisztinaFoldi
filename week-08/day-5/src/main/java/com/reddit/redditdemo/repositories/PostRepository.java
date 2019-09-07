package com.reddit.redditdemo.repositories;
import com.reddit.redditdemo.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
  List<Post> findAll();

}
