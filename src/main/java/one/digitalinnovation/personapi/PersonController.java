package one.digitalinnovation.personapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping
    @RequestMapping("/api/v1/people")

    public String getbook(){
        return "api teste";
    }

}
