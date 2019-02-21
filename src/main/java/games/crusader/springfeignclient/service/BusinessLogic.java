package games.crusader.springfeignclient.service;

import games.crusader.springfeignclient.client.TestClient;
import games.crusader.springfeignclient.client.UserClient;
import games.crusader.springfeignclient.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resources;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusinessLogic {

    @Autowired
    UserClient client;

    @Autowired
    TestClient testClient;

    public List<User> queryFeignClient() {
        System.out.println(client.getUsers().getContent());
        Resources<User> resources = client.findUserByUsername("jcage");
        return new ArrayList<>(resources.getContent());
    }
}
