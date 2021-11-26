package com.acko.acko.service;

import com.acko.acko.entity.Developer;
import com.acko.acko.repository.DeveloperRepository;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {

    @Autowired
    DeveloperRepository developerRepository;

    public Developer addDeveloper(Developer developer) throws HibernateException {
        return developerRepository.save(developer);
    }

    public Developer updateDeveloper(Developer developer) throws HibernateException {
        return developerRepository.save(developer);
    }

    public String deleteDeveloper(Integer developerId) {
        try {
            developerRepository.deleteById(developerId);
            return "Developer removed Successfully.";
        } catch (HibernateException exception) {
            exception.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "Cannot delete Developer";
    }

    public List<Developer> fetchAllDeveloper() {
        return (List<Developer>) developerRepository.findAll();
    }

    public Developer getDeveloperById(String developerId) {
        return developerRepository.findById(Integer.parseInt(developerId)).get();
    }
}
