package czw.controller;

import czw.aop.UserServiceAop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserServiceAop userServiceAop;

    @RequestMapping("/getUserById")
    public String getUserById(Integer id){
        return userServiceAop.getUserById(id);
    }

    @RequestMapping("/deleteUserById")
    public void deleteUserById(Integer id){
        userServiceAop.deleteUserById(id);
    }
}
