package guru.spramework.spring5.model;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String isn;
	private String publisher;
	
	
	@ManyToMany
	@JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"),inverseJoinColumns = @JoinColumn(name="author_id"))
	private Set<Author> authors = new HashSet<>();
	
	private Book() {
		
	}
	
	public Book(String title, String isn, String publisher, Set<Author> authors) {
		this.title = title;
		this.isn = isn;
		this.publisher = publisher;
		this.authors = authors;
	}



	public Book(String title, String isn, String publisher) {
		this.title = title;
		this.isn = isn;
		this.publisher = publisher;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getIsn() {
		return isn;
	}



	public void setIsn(String isn) {
		this.isn = isn;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public Set<Author> getAuthors() {
		return authors;
	}



	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isn=" + isn + ", publisher=" + publisher + ", authors="
				+ authors + "]";
	}
	
	
	
	
}
