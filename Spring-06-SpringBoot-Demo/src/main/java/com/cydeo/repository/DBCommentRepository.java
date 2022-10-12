package com.cydeo.repository;

import com.cydeo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("String comment: " + comment.getText() );
    }
}
