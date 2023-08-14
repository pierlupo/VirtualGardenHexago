package com.infrastructure.repository;

import com.infrastructure.entity.CommentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentEntityRepo extends CrudRepository<CommentEntity, Integer> {
}
