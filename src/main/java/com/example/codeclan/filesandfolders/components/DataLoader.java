package com.example.codeclan.filesandfolders.components;

import com.example.codeclan.filesandfolders.models.File;
import com.example.codeclan.filesandfolders.models.Folder;
import com.example.codeclan.filesandfolders.models.User;
import com.example.codeclan.filesandfolders.repository.FileRepository;
import com.example.codeclan.filesandfolders.repository.FolderRepository;
import com.example.codeclan.filesandfolders.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    private DataLoader() {

    }

    public void run(ApplicationArguments args) throws Exception {

        User user = new User("Jane");
        userRepository.save(user);

        Folder folder = new Folder("Embarrassing Photos From My Youth", user);
        folderRepository.save(folder);

        Folder folder2 = new Folder("Cat Pictures", user);
        folderRepository.save(folder2);

        File file = new File("Wee mosher", "jpg", 112510, folder);
        fileRepository.save(file);

        File file2 = new File("Kitten zoomies", "jpg", 234568, folder);
        fileRepository.save(file2);

        folder.addFile(file);
        folder2.addFile(file2);
        folderRepository.save(folder);
        folderRepository.save(folder2);

        user.addFolder(folder);
        user.addFolder(folder2);
        userRepository.save(user);

    }

}
