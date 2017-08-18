// name of the package
package helloWorld;

// importing the java library
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.*;

@Controller
@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller"})
// class name
public class helloWorld {

    @RequestMapping("/")
    @ResponseBody
// return Hello World! to front-end
    String home() {
        return "Hello World!";
    }
// main method of the program
    public static void main(String[] args) throws Exception {
        SpringApplication.run(helloWorld.class, args);
    }
}
