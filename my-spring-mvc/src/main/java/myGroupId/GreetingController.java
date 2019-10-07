package myGroupId.mySwingMVC;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import myGroupId.mySwingMVC.Greeting;

@RestController
public class GreetingController {
  private final AtomicLong counter = new AtomicLong();
  private final String format = "Hello %s!";

  @RequestMapping("/greeting")
  public Greeting greeting(
    @RequestParam(value="name", defaultValue="World")String name) {

    String content = String.format(format, name);
    double id = counter.incrementAndGet();
    return new Greeting(id, content);
  }
}
