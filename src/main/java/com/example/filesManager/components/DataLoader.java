package com.example.filesManager.components;

import com.example.filesManager.models.File;
import com.example.filesManager.models.Folder;
import com.example.filesManager.models.Person;
import com.example.filesManager.repositories.FileRepository;
import com.example.filesManager.repositories.FolderRepository;
import com.example.filesManager.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Profile("!test") // means it does not run when tests are run
@Component //Comment this out if you do not to run the data loader.
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Person person = new Person("Ines Hall");
        personRepository.save(person);

        Person person2 = new Person("Robin Dunn");
        personRepository.save(person2);

        Person person3 = new Person("Carol Gray");
        personRepository.save(person3);


        Folder homeworkFolder = new Folder("Homework", person);
        folderRepository.save(homeworkFolder);

        Folder stories = new Folder("Stories", person);
        folderRepository.save(stories);

        Folder coding= new Folder("Coding", person2);
        folderRepository.save(coding);


        File homeworkFile = new File("homework", "md", 45, homeworkFolder);
        fileRepository.save(homeworkFile);

        File pythonPractice = new File("Python Practice", "py", 430, coding);
        fileRepository.save(pythonPractice);

        File javaPractice = new File("Java Practice", "java", 43, coding);
        fileRepository.save(javaPractice);

        File javaScriptPractice = new File("JS Practice", "js", 130, coding);
        fileRepository.save(javaScriptPractice);

        File goodNightStory = new File("Good Night Story", "txt", 500, stories);
        fileRepository.save(goodNightStory);

        File jokes = new File("Jokes", "txt", 700, homeworkFolder);
        fileRepository.save(jokes);

        File boredRepetition = new File("Bored Repetition", "py", 600, homeworkFolder);
        fileRepository.save(boredRepetition);

        File gothicStory= new File("Gothic Story", "txt", 430, stories);
        fileRepository.save(gothicStory);


    }
}
