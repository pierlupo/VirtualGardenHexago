package com.domain.service;

import com.domain.model.Comment;

import java.util.List;

public interface CommentService {
    Comment saveComment(String content, int userId, int plantId);

    List<Comment> findByIdPlantComments(int plantID);
}
