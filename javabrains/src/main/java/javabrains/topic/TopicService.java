package javabrains.topic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	//In order to allow adding items this array must be mutable    
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("id01", "name01", "description01"),
			new Topic("id02", "name02", "description02"),
			new Topic("id03", "name03", "description03")
			));
	
	
	public List<Topic> getAllTopics(){
		
		return topics;
		
	}
	
	public Topic getTopic(String id){
		// Just Lambda.. get with it.
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}
	
	
	public void updateTopic(String id, Topic topic){
		for (int i = 0; i<topics.size(); i++){
			
			Topic t = topics.get(i);
			if (t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String id){
		topics.removeIf(t -> t.getId().equals(id));
	}
	
	
}
