// name of the package
package controller;

//importing the java library
import java.util.*;
import org.springframework.web.bind.annotation.*;
import model.Message;

@RestController
//class name
public class messageController {
	
// get route to show JSON at back-end	
	@RequestMapping("/hello")
	public List<Message> getMessage() {
		return Arrays.asList(
				new Message("Hello, World!")
		);
	}
}