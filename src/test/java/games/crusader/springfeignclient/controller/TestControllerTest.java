package games.crusader.springfeignclient.controller;

import games.crusader.springfeignclient.service.BusinessLogic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TestControllerTest {
    @InjectMocks
    TestController controller;

    @Mock
    BusinessLogic service;

    @Test
    public void verifyServiceIsCalled() {
        controller.routeToBusinessLogic();
        verify(service).queryFeignClient();
    }

}