package ProjectKanban.User.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjectKanban.User.model.Comment;
import ProjectKanban.User.respository.CommentRepository;

@Service
public class CommentService {
    
    @Autowired
    CommentRepository commentRepo;
    
    //Post Mapping for comments
    public String comment(Comment textData)
    {
        if(textData.getUserComment() != null)
        {
            commentRepo.save(textData);
            return "comment added";
        }
        
        return "error";
    }
    
    //To see comment details
    public List<Comment> getComment()
    {
        return commentRepo.findAll();
    }

    public void comment(int id) {
        
        commentRepo.deleteById(id);
    }

}
