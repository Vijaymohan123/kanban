package ProjectKanban.User.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ProjectKanban.User.model.Manager;
import ProjectKanban.User.respository.ManagerRepository;

@Service
public class ManagerService {
    
    @Autowired
    ManagerRepository manRepo;

   
    PasswordEncoder passwordEncryption;
    
    
    
    public Manager managerDetails(Manager manager) {
        this.passwordEncryption=new BCryptPasswordEncoder();
        String encodedPassword=this.passwordEncryption.encode(manager.getPassword());
        manager.setPassword(encodedPassword);
        return manRepo.save(manager);
    }

    public List<Manager> getManager() {
        
        return manRepo.findAll();
    }

    
}
