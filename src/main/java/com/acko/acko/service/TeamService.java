package com.acko.acko.service;

import com.acko.acko.entity.Team;
import com.acko.acko.repository.TeamRepository;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    public Team addTeam(Team team) throws HibernateException {
        System.out.println(team.toString());
        return teamRepository.save(team);
    }

    public Team updateTeam(Team team) throws HibernateException {
        return teamRepository.save(team);
    }

    public String deleteTeam(Integer teamId) {
        try {
            teamRepository.deleteById(teamId);
            return "Team removed Successfully.";
        } catch (HibernateException exception) {
            exception.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "Cannot delete Team";
    }

    public List<Team> fetchAllTeam() {
        return (List<Team>) teamRepository.findAll();
    }

    public Team getTeamById(String teamId) {
        return teamRepository.findById(Integer.parseInt(teamId)).get();
    }

}
