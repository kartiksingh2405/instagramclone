package com.technical.instagramclone.Service;

import com.technical.instagramclone.Entity.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.technical.instagramclone.Repository.CommentRepo;

import java.util.ArrayList;

@Service
public class CommentsService {

    @Autowired
    CommentRepo commentRepo;

    @Autowired
    UserService userService;

    public Comments submitCommentToDB(Comments comment) {
        return commentRepo.save(comment);
    }

    public ArrayList<Comments> getAllCommentsForDB(String postId){

        ArrayList<Comments> commentList=commentRepo.findAllByPostId(postId);

        for(int i=0;i<commentList.size();i++) {
            Comments commentItem=commentList.get(i);
            commentItem.setUserName(userService.displayUserMetaData(commentItem.getUserId()).getUserName());
        }

        return commentList;

    }

}
