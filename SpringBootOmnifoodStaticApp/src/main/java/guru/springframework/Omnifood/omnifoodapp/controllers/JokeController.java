package guru.springframework.Omnifood.omnifoodapp.controllers;


//Adding annotation of Controller to the class to make it controller

import guru.springframework.Omnifood.omnifoodapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    //----------Initializing Services to be called from this controller---//
    //Calling service layer from controller -> JokeService
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    //-------- Exposing controller to View Layer ------//
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}
