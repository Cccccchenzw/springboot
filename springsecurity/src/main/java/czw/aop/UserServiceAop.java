package czw.aop;

import org.springframework.stereotype.Service;

@Service
public class UserServiceAop {
    public String getUserById(Integer id){
        System.out.println("get......");
        return "user";
    }
    public void deleteUserById(Integer id){
        System.out.println("delete......");
    }
}
