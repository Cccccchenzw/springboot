package czw.controller;

import czw.aop.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUserById")
    public String getUserById(Integer id){
        return userService.getUserById(id);
    }

    @RequestMapping("/deleteUserById")
    public void deleteUserById(Integer id){
        userService.deleteUserById(id);
    }
}
