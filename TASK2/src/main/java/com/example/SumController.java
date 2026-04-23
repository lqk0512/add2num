package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SumController {

    private final Service service = new Service();

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/sum")
    public String sum(@RequestParam String a,
                      @RequestParam String b,
                      Model model) {

        String result = service.sum(a, b);

        model.addAttribute("result", result);
        model.addAttribute("steps", service.getSteps());

        return "index";
    }
}