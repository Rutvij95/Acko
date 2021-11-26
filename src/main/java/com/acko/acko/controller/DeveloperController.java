package com.acko.acko.controller;

import com.acko.acko.entity.Developer;
import com.acko.acko.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeveloperController {

    @Autowired
    DeveloperService developerService;

    @RequestMapping(value = "/developer", method = RequestMethod.POST)
    public Developer addDeveloper(@RequestBody Developer developer) {
        return developerService.addDeveloper(developer);
    }

    @RequestMapping(value = "/developer/{developerId}", method = RequestMethod.GET)
    public Developer getDeveloper(@PathVariable(value = "developerId") String developerId) {
        return developerService.getDeveloperById(developerId);
    }

    @RequestMapping(value = "/developer", method = RequestMethod.GET)
    public List<Developer> fetchAllDeveloper() {
        return developerService.fetchAllDeveloper();
    }

    @RequestMapping(value = "/developer", method = RequestMethod.PUT)
    public Developer updateDeveloper(@RequestBody Developer developer) {
        return developerService.updateDeveloper(developer);
    }

    @RequestMapping(value = "/developer/{developerId}", method = RequestMethod.DELETE)
    public String fetchAllDeveloper(@PathVariable(value = "developerId") String developerId) {
        return developerService.deleteDeveloper(Integer.parseInt(developerId));
    }
}
