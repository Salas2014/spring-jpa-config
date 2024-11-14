package org.example;

import org.example.config.RootConfig;
import org.example.repository.PersonRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(RootConfig.class);
        var repo = context.getBean(PersonRepository.class);

        repo.findAll()
                .forEach(System.out::println);
    }
}