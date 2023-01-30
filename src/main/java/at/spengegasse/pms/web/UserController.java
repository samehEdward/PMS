package at.spengegasse.pms.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController
{
    @RequestMapping("/{userID}")
    public String displayUser(@PathVariable int userID)
    {
        return "User Found: " + userID;
    }

    @RequestMapping("/{userID}/invoices")
    public String displayInvoices(@PathVariable int userID, @RequestParam(value = "date", required = false) Date date)
    {
        return "invoices for user : " + userID + "on the Date: " + date;
    }
}
