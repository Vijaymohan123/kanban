package ProjectKanban.User.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ProjectKanban.User.model.User;
import ProjectKanban.User.respository.Userrespository;

@Service
public class Userservice
{
	
	@Autowired
	Userrespository repo;
	
	PasswordEncoder passwordEncryption;
	
		
	// GET Mapping for single user	
	public User users(int dasId)
	{        
	    return repo.findById(dasId);
	}
	
	// GET Mapping for List of users
	public List<User> getUsers()
	{
		return repo.findAll();
	}
	
	//Post Mapping for save user data
	public User saveUser(User user)
	{
	    this.passwordEncryption=new BCryptPasswordEncoder();
	    String encodedPassword=this.passwordEncryption.encode(user.getPassword());
	    user.setPassword(encodedPassword);
	    return repo.save(user);
	}
	
	public User updateSingleUser(int dasId)
	{
	    return repo.findById(dasId);    
	}
	
	//Put Mapping for update user data
	public User updateUser(User user)
	{
	    return repo.save(user);
	}
	
	//Delete Mapping for delete user data
    public void delete(int dasId)
    {
        repo.deleteById(dasId);
    }
    
    //Search Mapping for search users Name 
    public List<String> search(String query)
    {
        return repo.search(query);
    }
     

    public User cardStatus(User cardStatus, int dasId) {
        
        User usr = repo.findById(dasId);
        
       usr.setCardStatus(cardStatus.getCardStatus());
        
        return repo.save(usr);
    }

}
