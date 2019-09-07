package com.reddit.redditdemo.controllers;
import com.reddit.redditdemo.models.Post;
import com.reddit.redditdemo.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RedditController {


  PostService postService;


  public RedditController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/reddit")
  public String homePage(Model model) {
    model.addAttribute("posts", postService.getAllPost());
    return "main";
  }


  @GetMapping("/submit")
  public String getToSubmitPage(Model model) {
    model.addAttribute("post", new Post());
    return "new-post";
  }

  @PostMapping("/submit")
  public String submit(@ModelAttribute Post newPost){
    postService.savePost(newPost);
    return "redirect:/reddit";
  }
}
