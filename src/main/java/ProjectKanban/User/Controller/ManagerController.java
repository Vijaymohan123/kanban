package ProjectKanban.User.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ProjectKanban.User.model.Manager;
import ProjectKanban.User.service.ManagerService;

@RestController
@CrossOrigin("http://localhost:4200")
public class ManagerController {
    
    @Autowired
    ManagerService manService;
    
    @PostMapping("/managers")
    public Manager managerDetails(@RequestBody Manager manager)
    {
        return manService.managerDetails(manager);
    }
    
    @GetMapping("/getManager")
    public List <Manager> getManager()
    {
        return manService.getManager();
    }

}
