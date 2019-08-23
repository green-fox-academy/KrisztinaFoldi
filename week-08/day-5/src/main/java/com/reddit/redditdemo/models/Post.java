package com.reddit.redditdemo.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {

  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private int numberOfLikes = 0;

  public Integer getId() {
    return id;
  }

  public Post(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfLikes() {
    return numberOfLikes;
  }

  public void setNumberOfLikes(int numberOfLikes) {
    this.numberOfLikes = numberOfLikes;
  }
}
