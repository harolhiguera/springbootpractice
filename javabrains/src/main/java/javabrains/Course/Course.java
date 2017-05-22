package javabrains.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javabrains.topic.Topic;
import lombok.Data;

@Data  //Creates Getters and setters
@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne // Because there could be many courses associated with to one topic
	private Topic topic;
	
	protected Course(){
	}
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}
	
}
