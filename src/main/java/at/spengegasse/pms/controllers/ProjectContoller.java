package at.spengegasse.pms.controllers;

import at.spengegasse.pms.dao.ProjectRepository;
import at.spengegasse.pms.entities.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectContoller
{
    @Autowired
    ProjectRepository proRepo;

    @GetMapping("/new")
   public String displayProjectForm(Model model){

        Project proj = new Project();
        model.addAttribute("project", proj);


        return "new-projects";
   }

   @PostMapping("/save")
    public String createProject(Project project, Model model){
    // this should handel saving to the Database
       proRepo.save(project);
        return "redirect:/projects/new";
    }

}
