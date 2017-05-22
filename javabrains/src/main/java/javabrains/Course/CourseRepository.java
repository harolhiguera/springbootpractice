package javabrains.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>  {

	// we need a method which takes a topic id and return a list of courses
	public List<Course> findByTopicId(String topicId);
	
	// Gets all courses based on the name 
	public List<Course> findByName(String name);
	
	// Gets all courses based on the Description 
	public List<Course> findByDescription(String discription);
	
	
}
