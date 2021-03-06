package javabrains.topic;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;

@Data  //Creates Getters and setters
@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String description;
	
	protected Topic(){
	}
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
}
