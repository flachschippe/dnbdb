package de.schulzt.dnbdb;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class DdClass implements Serializable {

	@Id
	@JsonIgnore
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID id;

	public DdClass() {
		
	}
	
	public DdClass(String title) {
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

	@Column(nullable = false, columnDefinition="text")
	private String title;
	
}
