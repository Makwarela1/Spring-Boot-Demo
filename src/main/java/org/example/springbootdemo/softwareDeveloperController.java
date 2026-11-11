package org.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-dev")

public class softwareDeveloperController {

    @GetMapping
    public List<softwareDevelopers> getSoftwareDevs(){
        return List.of(
                new softwareDevelopers(
                        1,
                        "Makwa",
                        "makwa@hotmail.com",
                        List.of("Java", "Js", "Node")
                ),

                new softwareDevelopers(
                        2,
                        "Siya",
                        "ngobz@gmail.com",
                        List.of("Java", "Js", "Node")
                )
        );
    }

}

