package ui.mediaFile;

import application.classesApp.MediaFile;
import facades.RessourceFacade;

public class AddMediaFileController {
	RessourceFacade rssFac ;

	public AddMediaFileController() {
		super();
	}
	
	public void createMedia(MediaFile media) {
		rssFac = new RessourceFacade();
		rssFac.addMedia(media);
		
	}

}
