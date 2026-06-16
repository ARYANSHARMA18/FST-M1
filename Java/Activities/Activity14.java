package activities;

import java.io.File;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Activity14 {
	public static void main(String[] args) {
		try {
		File file = new File("src/main/resources/newfile.txt");
		boolean fStatus = file.createNewFile();
		
		if(fStatus) {
			System.out.println("New file created");
			
			FileUtils.writeStringToFile(file, "Hey! New file is created!!!",Charset.defaultCharset());
		}
		else {
			System.out.println("file already exists!");
		}
		
		System.out.println("Data in file: " + FileUtils.readFileToString(file,"UTF-8"));
		
		File newDir = new File("src/main/resources/destDir");
		FileUtils.copyFileToDirectory(file, newDir);
		
		File newFile = FileUtils.getFile(newDir, "newfile.txt");		
		
		String newFileData = FileUtils.readFileToString(newFile, "UTF-8");
		
		System.out.println("Data in new file: " + newFileData);

		}catch(Exception ex) {
			System.out.println(ex.getMessage());			
		};
		
	}
}
