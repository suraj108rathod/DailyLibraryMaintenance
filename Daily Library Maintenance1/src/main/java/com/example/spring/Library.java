package com.example.spring;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Library {
	@Id
	private int book_id;
	private String book_name;
	private String author;
	private int no_of_copies;
	private String status;
	private String issue_date;
	private String last_return_date;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNo_of_copies() {
		return no_of_copies;
	}

	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}

	public String getLast_return_date() {
		return last_return_date;
	}

	public void setLast_return_date(String last_return_date) {
		this.last_return_date = last_return_date;
	}

}
