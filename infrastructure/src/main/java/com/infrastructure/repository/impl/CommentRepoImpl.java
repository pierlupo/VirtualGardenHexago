package com.infrastructure.repository.impl;

import com.domain.model.Comment;
import com.domain.port.CommentRepo;
import com.infrastructure.entity.CommentEntity;
import com.infrastructure.repository.CommentEntityRepo;
import org.modelmapper.ModelMapper;

import java.util.List;

public class CommentRepoImpl implements CommentRepo {

    private final CommentEntityRepo commentEntityRepo;
    private final ModelMapper modelMapper;

    public CommentRepoImpl(CommentEntityRepo commentEntityRepo, ModelMapper modelMapper) {
        this.commentEntityRepo = commentEntityRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public Comment save(Comment comment) {
        CommentEntity commentEntity = modelMapper.map(comment, CommentEntity.class);
        return modelMapper.map(commentEntityRepo.save(commentEntity), Comment.class);    }

    @Override
    public List<Comment> findByPlantId(int plantId) {
        return null;
    }
}
