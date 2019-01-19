package ui.topic;

import java.util.ArrayList;

import application.classesApp.MediaFile;

public class TestTopic {

	public static void main(String[] args) {
		TopicHomePage thp = new TopicHomePage();
		ArrayList<MediaFile> lmd = thp.getAllMediaFiles();
		for(int i =0 ; i<lmd.size();i++) {
			System.out.println(lmd.get(i).getNameMediaFile());
		}
	}

}
