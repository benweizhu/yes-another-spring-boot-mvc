package mvc.controller;

import mvc.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "/user/{id}")
    public User getUser(@PathVariable long id) {
        return new User(id);
    }
}
