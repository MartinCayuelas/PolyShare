package application.classesApp;

/**
 * <b>Answer</b> to a question on the forum
 * @author ponthieu
 */
public class Answer {

    /**
     * Default constructor
     */
    public Answer() {
    }
    
    public Answer(int id, String content, int nbLikesAnswer) {
		super();
		this.id = id;
		this.content = content;
		this.nbLikesAnswer = nbLikesAnswer;
	}
    

	public Answer(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	


	public Answer(String content) {
		super();
		this.content = content;
	}




	private int id;
    
    private String content;
    
    private int nbLikesAnswer;


    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

    private Question listOfAnswer;

    /**
     * Like an answer
     */
    public void addLike() {
        // TODO implement here
    }

    /**
     * Modify the content of an answer
     * @param text new content of the answer
     */
    public void modifyAnswer(String text) {
        // TODO implement here
    }

    /**
     * Delete a like on an asnwer
     */
    public void deleteLike() {
        // TODO implement here
    }

    /**
     * @return Total number of like for an answer
     */
    public int getNbLikesAnswer() {
        return this.nbLikesAnswer;
    }

    /**
     * Change the number of like for an answer (+1 or -1)
     * @param value new number of like for an answer
     */
    public void setNbLikesAnswer(int value) {
        this.nbLikesAnswer = value;
    }

}