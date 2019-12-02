package com.example.demo.service.impl;

import com.example.demo.mapper.CommentLikesMapper;
import com.example.demo.model.CommentLikesRecord;
import com.example.demo.service.CommentLikesRecordService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * Describe:
 */
@Service
public class CommentLikesRecordServiceImpl implements CommentLikesRecordService {

    @Autowired
    CommentLikesMapper commentLikesMapper;
    @Autowired
    UserService userService;

    @Override
    public boolean isLiked(long articleId, long pId, String username) {
        return commentLikesMapper.isLiked(articleId, pId, userService.findIdByUsername(username)) != null;
    }

    @Override
    public void insertCommentLikesRecord(CommentLikesRecord commentLikesRecord) {
        commentLikesMapper.insertCommentLikesRecord(commentLikesRecord);
    }

    @Override
    public void deleteCommentLikesRecordByArticleId(long articleId) {
        commentLikesMapper.deleteCommentLikesRecordByArticleId(articleId);
    }
}
