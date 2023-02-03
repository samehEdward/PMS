package at.spengegasse.pms.controllers;

import at.spengegasse.pms.entities.Project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectContoller
{
    @RequestMapping("/new")
   public String displayProjectForm(Model model){

        Project proj = new Project();
        model.addAttribute("project", proj);


        return "new-projects";
   }
}
