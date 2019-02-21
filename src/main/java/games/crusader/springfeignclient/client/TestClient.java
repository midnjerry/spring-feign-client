package games.crusader.springfeignclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="test", url="http://localhost:8081")
public interface TestClient {
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String getIndex();
}
