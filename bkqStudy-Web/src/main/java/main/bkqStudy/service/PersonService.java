package main.bkqStudy.service;


import main.bkqStudy.entity.Person;
import main.bkqStudy.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonMapper personMapper;

    public Person Sel(int id) {
        return personMapper.Sel(id);
    }
}
