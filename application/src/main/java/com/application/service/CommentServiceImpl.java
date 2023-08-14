package com.application.service;

import com.domain.model.Comment;
import com.domain.port.CommentRepo;
import com.domain.service.CommentService;
import com.domain.service.PlantService;
import com.domain.service.UserService;

import java.util.List;

public class CommentServiceImpl implements CommentService {

    private final UserService userService;
    private final PlantService plantService;
    private final CommentRepo commentRepo;

    public CommentServiceImpl(UserService userService, PlantService plantService, CommentRepo commentRepo) {
        this.userService = userService;
        this.plantService = plantService;
        this.commentRepo = commentRepo;
    }

    @Override
    public Comment saveComment(String content, int userId, int plantId) {
        if(plantService.findById(plantId).isPresent() && userService.findById(userId).isPresent()){
            Comment comment = new Comment(content, plantService.findById(plantId).get(), userService.findById(userId).get());
            commentRepo.save(comment);
        }
        throw new RuntimeException();
    }

    @Override
    public List<Comment> findByIdPlantComments(int plantID) {
        return commentRepo.findByPlantId(plantID);
    }
}
