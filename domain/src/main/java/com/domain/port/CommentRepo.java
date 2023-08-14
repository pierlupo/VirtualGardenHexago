package com.domain.port;

import com.domain.model.Comment;

import java.util.List;

public interface CommentRepo {
    Comment save(Comment comment);
    List<Comment> findByPlantId(int plantId);
}
