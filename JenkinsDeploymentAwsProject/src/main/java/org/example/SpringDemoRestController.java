package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemoRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloUser(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok(String.format("Hello %s!", name));
    }

}