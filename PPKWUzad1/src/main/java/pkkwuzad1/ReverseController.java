package pkkwuzad1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {
    @GetMapping("/rev/{input}")
    public String reverse(@PathVariable("input") String input) {
        char chars[] = input.toCharArray();
        String rev = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            rev += chars[i];
        }
        return rev;
    }
}
