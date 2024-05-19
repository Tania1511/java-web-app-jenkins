package project.javaWebapp.javawebappjenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contr {

    @GetMapping("/get")
    public String get(){
        return "HEllo jenkins";
    }
}
