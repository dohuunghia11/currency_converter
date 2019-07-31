package convertM;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ConvertMoney {
    @GetMapping("/convert")
    public String showForm() {

        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam String rate, @RequestParam String usd, Model model) {
        Float vnd = Float.parseFloat(rate) * Float.parseFloat(usd);
        model.addAttribute("vnd", vnd);
        return "index";
    }
}