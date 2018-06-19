package com.springboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics(){
	
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll()//findAll gives an iterable object from the repository
		.forEach(topics::add);
		//Java 8 lambda references for method references for for each
		return topics;
	}
	public Topic getTopic(String id) {
		Topic topic=null;
		topic=topicRepository.findOne(id);
		return topic;
	}
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}
	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
