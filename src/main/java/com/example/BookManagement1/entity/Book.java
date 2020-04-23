package com.example.BookManagement1.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(Include.NON_NULL)
public class Book {
	
	@Getter
	@Setter
	@JsonProperty(value="Id")
	int bookId;
	
	@Getter
	@Setter
	@JsonProperty(value = "Name")
	String bookName;
	
	@Getter
	@Setter
	@JsonProperty(value = "Price")
	float bookPrice;
	
	@Getter
	@Setter
	@JsonProperty(value = "Author")
	String bookAuthor;
	
	@Getter
	@Setter
	@JsonProperty(value="Type")
	String bookType;

}
