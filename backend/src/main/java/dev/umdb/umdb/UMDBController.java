package dev.umdb.umdb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/")
public class UMDBController {
    @GetMapping()
    public String umdbAPI() {
        return "Welcome to UMDB API!";
    }
    
}
