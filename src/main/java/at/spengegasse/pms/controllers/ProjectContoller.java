package at.spengegasse.pms.controllers;

import at.spengegasse.pms.dao.EmployeeRepository;
import at.spengegasse.pms.dao.ProjectRepository;
import at.spengegasse.pms.entities.Employee;
import at.spengegasse.pms.entities.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectContoller
{
    @Autowired
    ProjectRepository proRepo;

    @Autowired
    EmployeeRepository empRepo;

    @GetMapping
    public String displayEmployees(Model model)
    {
        List<Project> pojs = proRepo.findAll();
        model.addAttribute("prosList", pojs);
        return "projects/list-projects";
    }

    @GetMapping("/new")
   public String displayProjectForm(Model model){

        List<Employee> employees = empRepo.findAll();
        model.addAttribute("allEmployees", employees);

        Project proj = new Project();
        model.addAttribute("project", proj);


        return "projects/new-projects";
   }

   @PostMapping("/save")
    public String createProject(Project project,@RequestParam List<Long> employees, Model model){
    // this should handel saving to the Database
       proRepo.save(project);

       Iterable<Employee> chosenEmployees = empRepo.findAllById(employees);
        for(Employee emp : chosenEmployees) {
            emp.setTheProject(project);
            empRepo.save(emp);
        }

        return "redirect:/projects/new";
    }

}
