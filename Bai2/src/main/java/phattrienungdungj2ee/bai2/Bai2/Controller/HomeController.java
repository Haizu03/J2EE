package phattrienungdungj2ee.bai2.Bai2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String Index() {
        return "index";
    }
}
