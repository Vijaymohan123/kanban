package ProjectKanban.User.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ProjectKanban.User.model.Comment;
import ProjectKanban.User.service.CommentService;

@RestController
@CrossOrigin("http://localhost:4200")
public class CommentController {
    
    @Autowired
    CommentService commentService;
    
    @PostMapping("/comments")
    public String comment(@RequestBody Comment textData)
    {
        return commentService.comment(textData);
    }
    
    @GetMapping("/getComments")
    public List<Comment> getComment()
    {
        return commentService.getComment();
    }
    
    @DeleteMapping("/deleting/{id}")
    public void comment(@PathVariable int id)
    {
        commentService.comment(id);
    }

}
