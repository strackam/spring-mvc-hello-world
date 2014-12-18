package me.test.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value="who", required=false, defaultValue="World") String who, ModelMap model) {
        model.addAttribute("message", String.join(" ", "Hello", who));
        return "message";
    }


    @RequestMapping(value = "/coucou", method = RequestMethod.GET)
    public String coucou(@RequestParam(value="who", required=false, defaultValue="Monde") String who, ModelMap model) {
        model.addAttribute("message", String.join(" ", "Coucou", who));
        return "message";
    }

}