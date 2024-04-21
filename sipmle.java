import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SimpleWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebsiteApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}

