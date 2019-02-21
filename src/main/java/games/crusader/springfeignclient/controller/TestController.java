package games.crusader.springfeignclient.controller;

import games.crusader.springfeignclient.model.User;
import games.crusader.springfeignclient.service.BusinessLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    BusinessLogic service;

    @GetMapping("/test")
    public List<User> routeToBusinessLogic(){
        return service.queryFeignClient();
    }

    @GetMapping("/")
    public String index(){
        return "Index";
    }
}
