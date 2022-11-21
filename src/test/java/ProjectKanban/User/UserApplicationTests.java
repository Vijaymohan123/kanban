package ProjectKanban.User;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ProjectKanban.User.model.User;
import ProjectKanban.User.respository.Userrespository;

@SpringBootTest
class UserApplicationTests {

//	@Test
//	void contextLoads() {
//	}
    @Autowired
    Userrespository repo;
    @Test
    public void testGetUser()
    {
//        List<User> user=repo.findAll();
//        assertAll;
    }

}
