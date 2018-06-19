package com.springboot.topics;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String>{//first is the type of object and second is the primary key
//Spring data JPA have the default operation for CRUD in built so are not required to implement the methods specifically.
	
}
