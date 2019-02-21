package games.crusader.springfeignclient.service;

import games.crusader.springfeignclient.client.UserClient;
import games.crusader.springfeignclient.controller.TestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class BusinessLogicTest {
    @InjectMocks
    BusinessLogic service;

    @Mock
    UserClient client;

    @Test
    public void verifyServiceIsCalled() {
        service.queryFeignClient();
        verify(client).findUserByUsername(any());
    }

}