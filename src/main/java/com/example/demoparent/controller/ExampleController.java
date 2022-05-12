package com.example.demoparent.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoparent.util.TOMLGenerator;

@RestController
public class ExampleController {

    @GetMapping("/example")
    public String example() {
        // create an example hashmap
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        return new TOMLGenerator(map).toString();
    }
}
