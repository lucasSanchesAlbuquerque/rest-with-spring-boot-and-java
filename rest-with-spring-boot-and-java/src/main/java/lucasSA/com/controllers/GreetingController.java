package lucasSA.com.controllers;

import lucasSA.com.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //Http://localhost:8080/greeting?name=Lucas - requestparam é opcional na url
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Wolrd") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }

    @GetMapping("/test")
    public String test() {
        return "API está funcionando!";
    }
}
