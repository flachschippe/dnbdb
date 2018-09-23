package de.schulzt.dnbdb;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Keyword implements Serializable {

	@Id
	@JsonIgnore
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID id;

	public Keyword() {
		
	}
	
	public Keyword(String title) {
		super();
		this.title = title;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(nullable = false)
	private String title;
	
}
