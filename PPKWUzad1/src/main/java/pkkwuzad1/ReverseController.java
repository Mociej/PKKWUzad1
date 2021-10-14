package pkkwuzad1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {
    @GetMapping("/rev")
    public String greeting() {
        return "ver";
    }
}
