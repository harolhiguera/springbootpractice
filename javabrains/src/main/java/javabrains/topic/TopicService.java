package javabrains.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	private List<Topic> topics = Arrays.asList(
			new Topic("id01", "name01", "description01"),
			new Topic("id02", "name02", "description02"),
			new Topic("id03", "name03", "description03")
			);
	
	
	public List<Topic> getAllTopics(){
		
		return topics;
		
	}
	
	public Topic getTopic(String id){
		
		// Just Lambda.. get with it.
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}
	
}
