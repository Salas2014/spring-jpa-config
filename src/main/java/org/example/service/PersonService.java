package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PersonService {

    public final PersonRepository personRepository;

    public void updatePersonByFirstName(Long id, String newName) {
        var person = personRepository.findById(id).orElseThrow();
        person.setFirstName(newName);
    }
}
