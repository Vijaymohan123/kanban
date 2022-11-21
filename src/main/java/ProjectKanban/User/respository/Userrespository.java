package ProjectKanban.User.respository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ProjectKanban.User.model.User;


@Repository
public interface Userrespository extends JpaRepository<User,Integer>
{
    //To get single user
    
    User findById(int dasId);
    
    //To get candidateName by using search query
    
    @Query(value = "select * from registerlogin rl where lower(candidate_name) LIKE %:query%",nativeQuery=true)
    List<String> search(String query);


}