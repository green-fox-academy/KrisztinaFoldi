package com.todolistmysql.mysqltodo.models;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Assignee {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String email;

  public Assignee() {
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public Long getId() {
    return id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
