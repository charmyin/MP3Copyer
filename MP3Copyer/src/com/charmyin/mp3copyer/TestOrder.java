package com.charmyin.mp3copyer;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class TestOrder {

	public static void main(String[] args) {
		//directory name
		String dirName = "lyhk";
		//Directory path
		File baseDirFile = new File("D:\\readbook\\copying\\"+dirName);
		//The suffix of file to be fitered ~
		String[] suffix = new String[]{"MP3", "mp3"};
		Collection<File> fileCtn = FileUtils.listFiles(baseDirFile, suffix, true);
		for(File file : fileCtn){
			System.out.println(file.getName());
		}
		System.out.println(fileCtn.size());
	}

}
