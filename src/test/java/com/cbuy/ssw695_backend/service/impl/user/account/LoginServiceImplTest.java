package com.cbuy.ssw695_backend.service.impl.user.account;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

@SpringBootTest
public class LoginServiceImplTest {


//    @Autowired
//    RegisterServiceImpl registerService;


    @Test
    public void testEmpty() {
        RegisterServiceImpl registerService = new RegisterServiceImpl();

        HashMap<String, String> expected1 = new HashMap<>();
        expected1.put("error_message", "User Name cannot be Empty");

        HashMap<String, String> output = (HashMap<String, String>) registerService.register("", "ptesting", "ptesting");
        assertEquals(output, expected1);
    }

//    @Test
//    public void testExist() {
//
//        RegisterServiceImpl registerService = new RegisterServiceImpl();
//
//
//        HashMap<String, String> expected2 = new HashMap<>();
//        expected2.put("error_message", "User name exists");
//        HashMap<String, String> output = (HashMap<String, String>) registerService.register("noname", "ptesting", "ptesting");
//        assertEquals(output, expected2);
//    }
    @Test
    public void testDifferent(){
        RegisterServiceImpl registerService = new RegisterServiceImpl();


        HashMap<String, String> expected3 = new HashMap<>();
        expected3.put("error_message", "two passwords are different");

        HashMap<String, String> output = (HashMap<String, String>) registerService.register("noname", "ptesting", "ptesting2");
        assertEquals(output, expected3);

    }
}
