package at.spengegasse.pms.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController
{
    @RequestMapping("/basic")
    public String sayHello(){
        return "<h1>Hello</h1>";
    }

    @RequestMapping("/user_entry")
    public String userForm()
    {
  return   "<form action=\"/greeting/user_greeting\" method=\"POST\">\n" +
            "  <label for=\"fname\">First name:</label><br>\n" +
            "  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"John\"><br>\n" +
            "  <label for=\"lname\">Last name:</label><br>\n" +
            "  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"Doe\"><br><br>\n" +
            "  <input type=\"submit\" value=\"Submit\">\n" +
            "</form> ";
    }

    @RequestMapping(value = "/user_greeting", method = RequestMethod.POST)
    public String printUserGreeting()
    {
        return "form submitted";
    }

}
