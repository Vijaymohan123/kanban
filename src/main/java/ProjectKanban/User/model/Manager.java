package ProjectKanban.User.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;
    String managerName;
    String password;
    public Manager() {
   
    }
    
    public Manager(int id,String managerName,String password)
    {

        this.id=id;
        this.managerName=managerName;
        this.password=password;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager [id=" + ", managerName=" + managerName + ", password=" + password + "]";
    }
    
    
    
    
    
}
