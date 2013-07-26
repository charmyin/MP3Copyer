package com.charmyin.mp3copyer;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class Mp3Copyer {

	public static void main(String[] args) {
		//Base dir and the destination dir 
		String srcFileDirPath = "D:\\readbook\\copying\\";
		String descFileDirPath = "F:\\";
		//directory name
		String dirName = "lyhk";
		String chineseName = "洛阳豪客";
		//Directory path
		File baseDirFile = new File( srcFileDirPath + dirName );
		//The suffix of file to be fitered ~
		String[] suffix = new String[]{"MP3", "mp3"};
		Collection<File> fileCtn = FileUtils.listFiles(baseDirFile, suffix, true);
		
		//Temp virable to store the count of file
		int countFile = 1;
		try{
			for(File file : fileCtn){
				System.out.println(file.getName());
				File destFile = new File(descFileDirPath + dirName+"\\"+chineseName+countFile+".mp3");
				FileUtils.copyFile(file, destFile);
				countFile++;
//				if(countFile>5){
//					break;
//				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("共有"+fileCtn.size()+"个文件！");
	}

}
