package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;

@Controller
public class ChuckController {

    private final JokeService jokeService;

    public ChuckController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String getJoke(){
        return jokeService.getJoke();
    }


}
