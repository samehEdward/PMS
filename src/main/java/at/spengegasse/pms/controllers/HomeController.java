package at.spengegasse.pms.controllers;

import at.spengegasse.pms.dao.EmployeeRepository;
import at.spengegasse.pms.dao.ProjectRepository;
import at.spengegasse.pms.entities.Employee;
import at.spengegasse.pms.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    EmployeeRepository empl;
    @Autowired
    ProjectRepository repos;

    @GetMapping("/")
    public String displayHome(Model model)
    {
     List<Project> projects =  repos.findAll();
     model.addAttribute("prosList", projects);

        List<Employee> employees = empl.findAll();
        model.addAttribute("empoList", employees);

        return "main/home";
    }



  //  @GetMapping("/")
  //  public String displayEmployee(Model model)
  //  {
  //  List<Employee> employees = empl.findAll();
   // model.addAttribute("empoList", employees);
    //    return "main/home";
   // }
}
