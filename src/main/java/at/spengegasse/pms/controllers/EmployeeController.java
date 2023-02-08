package at.spengegasse.pms.controllers;

import at.spengegasse.pms.dao.EmployeeRepository;
import at.spengegasse.pms.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository empl;


    @GetMapping
    public String displayEmployees(Model model)
    {
        List<Employee> empls = empl.findAll();
        model.addAttribute("emplList", empls);
        return "employees/list-employees";
    }

    @GetMapping("/new")
    public String displayEmployee(Model model){


        Employee aemployee = new Employee();

        model.addAttribute("emp", aemployee);
        return "employees/new-employee";
    }

    @PostMapping("/save")
    public String createEmployee(Employee empo, Model model)
    {
        empl.save(empo);
        return "redirect:/employees/new";
    }
}
