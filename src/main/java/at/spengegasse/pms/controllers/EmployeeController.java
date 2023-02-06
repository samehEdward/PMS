package at.spengegasse.pms.controllers;

import at.spengegasse.pms.dao.EmployeeRepository;
import at.spengegasse.pms.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository emp;

    @GetMapping("/new")
    public String displayEmployee(Model model){


        Employee aemployee = new Employee();

        model.addAttribute("emp", aemployee);
        return "new-employee";
    }

    @PostMapping("/save")
    public String createEmployee(Employee empo, Model model)
    {
        emp.save(empo);
        return "redirect:/employee/new";
    }
}
