package games.crusader.springfeignclient.client;

import feign.Param;
import games.crusader.springfeignclient.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name="spring-user-crud", decode404 = true)
@FeignClient(name="spring-user-crud")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, path = "users/search/findByUsername?username={username}")
    public Resources<User> findUserByUsername(@Param("username") String username);

    @RequestMapping(method = RequestMethod.GET, path = "users")
    public Resources<User> getUsers();

}


