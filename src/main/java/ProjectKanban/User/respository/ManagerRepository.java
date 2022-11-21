package ProjectKanban.User.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProjectKanban.User.model.Manager;
@Repository
public interface ManagerRepository extends JpaRepository<Manager,Integer>{
    
    
    

    
}
