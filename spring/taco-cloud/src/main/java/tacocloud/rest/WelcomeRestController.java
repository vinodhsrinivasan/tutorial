package tacocloud.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping(path="/api",produces = "application/json")
@RestController
public class WelcomeRestController {

    @GetMapping("/getdate")
    public Date getDate(){
        Date d = new Date();
        return d;
    }

    @PostMapping("greeting")
    public String greeting(String name){
        return "Welcome "+name;
    }
}
