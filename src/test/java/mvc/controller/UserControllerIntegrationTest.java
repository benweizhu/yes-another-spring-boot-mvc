package mvc.controller;

import static org.assertj.core.api.Assertions.assertThat;

import mvc.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles(value = "test")
public class UserControllerIntegrationTest {

    @Autowired
    private DefaultController controller;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }
}