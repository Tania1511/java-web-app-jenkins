package project.javaWebapp.javawebappjenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Contr {

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "HEllo jenkins";
    }
}
