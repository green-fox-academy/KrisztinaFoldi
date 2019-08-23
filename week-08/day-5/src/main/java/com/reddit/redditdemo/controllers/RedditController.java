package com.reddit.redditdemo.controllers;
import com.reddit.redditdemo.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RedditController {

  PostRepository postRepository;

  public RedditController(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @RequestMapping
  public String homePage(Model model) {
    model.addAttribute("posts", postRepository.findAll());
    return "index";
  }

  @RequestMapping("/submit")
  public String submitPage() {
    return "new-post";
  }
}
