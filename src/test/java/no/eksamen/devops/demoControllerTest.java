package no.eksamen.devops;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class demoControllerTest {
    @Test
    void contextLoads() {
    }

    @Test
    public void simpleTest() {
        int a = 5;
        int b = 10;
        int c = a + b;

        assertEquals(15, c);
    }  @Test
    public void simpleTest2() {
        int a = 100;
        int b = 100;
        int c = a + b;

        assertEquals(200, c);
    }
}