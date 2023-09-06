package com.programming.class2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;


public class DeleteOneDirectory {
	public static void main(String[] args) throws IOException {
		
Path p = Paths.get("C:/Files/ABC8.txt");
		Files.delete(p);
		//System.out.println("One directory got deleted")
		
		Path p2 = Paths.get("C:/Files/ABC");
		
		BasicFileAttributeView view = Files.getFileAttributeView(p, BasicFileAttributeView.class);
		BasicFileAttributes attr = view.readAttributes();
		
		FileTime creatinTime = attr.creationTime();
		System.out.println("Creation Time of File " + creatinTime);
		
		FileTime lastAccessedTime = attr.lastAccessTime();
		System.out.println("Last Accessed Time of file " + lastAccessedTime);
		
		FileTime lastModifiedTime = attr.lastModifiedTime();
		System.out.println("Last modified time " + lastModifiedTime);
		
	}

}
