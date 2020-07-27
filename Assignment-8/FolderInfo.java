package filehandling;

import java.io.File;

public class FolderInfo {
	static void printDirectory(String folderPath) {
		int temp = 0;
		File file = new File(folderPath);
		File[] fileList = file.listFiles();
		for(File f : fileList) {
			if(f.isFile()) {
				System.out.println("File : " + f.getName());
				System.out.println("Absolute Path : " + f.getAbsolutePath());
				System.out.println("Folder Path : " + f.getParent());
				temp = 1;
			}
			if(f.isDirectory()) {
				System.out.println("Directory : " + f.getName());
				System.out.println("Path : " + f.getParent());
			}
		}
		if(temp == 0)
			System.out.println("No folder exists in given path");
	}
	
	public static void main(String[] args) {
		printDirectory("M:\\File\\Badminton");
	}
}
