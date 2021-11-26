package com.acko.acko.controller;

import com.acko.acko.entity.Team;
import com.acko.acko.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    TeamService teamService;

    @RequestMapping(value = "/team", method = RequestMethod.POST)
    public Team addTeam(@RequestBody Team team) {
        return teamService.addTeam(team);
    }

    @RequestMapping(value = "/team/{teamId}", method = RequestMethod.GET)
    public Team getTeam(@PathVariable(value = "teamId") String teamId) {
        return teamService.getTeamById(teamId);
    }

    @RequestMapping(value = "/team", method = RequestMethod.GET)
    public List<Team> fetchAllTeam() {
        return teamService.fetchAllTeam();
    }

    @RequestMapping(value = "/team", method = RequestMethod.PUT)
    public Team updateTeam(@RequestBody Team team) {
        return teamService.updateTeam(team);
    }

    @RequestMapping(value = "/team/{teamId}", method = RequestMethod.DELETE)
    public String fetchAllTeam(@PathVariable(value = "teamId") String teamId) {
        return teamService.deleteTeam(Integer.parseInt(teamId));
    }
}
