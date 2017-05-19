package javabrains.topic;

import lombok.Data;

@Data  //Creates Getters and setters
public class Topic {

	private String id;
	private String name;
	private String description;
	
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
}
