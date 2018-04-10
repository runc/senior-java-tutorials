package com.ak47;

import com.ak47.spring5.x.Spring5Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Spring5Application.class)
public class Spring5ApplicationIntegrationTest {

    @Test
    public void contextLoads() {
    }

}
