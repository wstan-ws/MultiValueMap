package sg.edu.nus.iss.multivaluemap.controller;

import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/user")
    public String createuser(@RequestBody MultiValueMap<String, String> form, Model model) {
        String name = form.getFirst("name");
        String email = form.getFirst("email");
        String phone = form.getFirst("phone");

        System.out.printf("name %s\n", name);
        System.out.printf("email %s\n", email);
        System.out.printf("phone %s\n", phone);

        return "";
    }
}
