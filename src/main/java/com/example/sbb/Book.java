package com.example.sbb;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
	private String title;
	private String author;
	
	public static void main(String args[]) {
		Book book = new Book();
		
		book.setAuthor("베르나르베르베르");
		book.setTitle("고양이");
		
		System.out.println(book.getAuthor());
		System.out.println(book.getTitle());
	}
}
