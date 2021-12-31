package org.rrajesh1979.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloMavenTest {

    @Test
    public void getMessage() {
        System.out.println("Inside getMessage() Test");
        HelloMaven helloMaven = new HelloMaven();
        assertEquals(HelloMaven.MESSAGE, helloMaven.getMessage());
    }
}