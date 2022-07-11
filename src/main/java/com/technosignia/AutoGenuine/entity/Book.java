package com.technosignia.AutoGenuine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="Book")
public class Book 
{
   @Id 
   @ApiModelProperty(notes="Id of Book",name="id",required=true)
   @Column(name="id")
   private Long id;
   
   @ApiModelProperty(notes="Name of Book",name="name",required=true)
   @Column(name="name")
   private String name;
   
   @ApiModelProperty(notes="Author of Book",name="author",required=true)
   @Column(name="author")
   private String author;
   

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}
   
   
   
   

   
   
    
}
