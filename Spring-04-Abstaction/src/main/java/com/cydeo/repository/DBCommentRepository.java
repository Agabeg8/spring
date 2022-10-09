package com.cydeo.repository;

import com.cydeo.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void store(Comment comment) {
        System.out.println("Stroing comment: " + comment.getText() );
    }
}
