package com.example.codeclan.filesandfolders;

import com.example.codeclan.filesandfolders.models.File;
import com.example.codeclan.filesandfolders.models.Folder;
import com.example.codeclan.filesandfolders.models.User;
import com.example.codeclan.filesandfolders.repository.FileRepository;
import com.example.codeclan.filesandfolders.repository.FolderRepository;
import com.example.codeclan.filesandfolders.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesandfoldersApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFolderThenSave() {
		User user = new User("Jane");
		userRepository.save(user);

		Folder folder = new Folder("Embarrassing Photos From My Youth", user);
		folderRepository.save(folder);

		userRepository.save(user);
	}

	@Test
	public void createFolderAndFileThenSave() {
		User user = new User("Jane");
		userRepository.save(user);

		Folder folder = new Folder("Embarrassing Photos From My Youth", user);
		folderRepository.save(folder);

		File file = new File("Wee mosher", "jpg", 112510, folder);
		fileRepository.save(file);

		folder.addFile(file);
		folderRepository.save(folder);
	}

}
