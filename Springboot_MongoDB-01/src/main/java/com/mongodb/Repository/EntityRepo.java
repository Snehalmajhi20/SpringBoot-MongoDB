package com.mongodb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.Entity.UserEntity;

public interface EntityRepo extends MongoRepository<UserEntity, Integer>{

}
