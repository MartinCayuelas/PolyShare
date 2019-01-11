package facades;

import application.classesApp.Student;
import factory.AbstractFactory;
import persistent.DAO.StudentDAO;

/**
 * 
 */
public class LoginFacade {
	
	private AbstractFactory abstractFactory = AbstractFactory.getFactoryMySql();
	private StudentDAO studentDAO = abstractFactory.getStudentDAO();
	private Boolean connected=false; 
	private Student student;

    /**
     * Default constructor
     */
    public LoginFacade() {
    }


    /**
     * @param email 
     * @param password 
     * @return boolean true if the student is logged false if wrong login or password
     */
    public void login(String email, String password) {
        // TODO implement here
    	student = studentDAO.login(email, password);
		
		if(student != null) {
			setConnected(true);
		} else {
			setConnected(false);
		}
    }
    
    public void signUp(String nameStudent, String firstNameStudent, String emailStudent, String password, String loginID) {
		student = new Student(0, nameStudent,firstNameStudent,emailStudent,password,loginID,null);
		studentDAO.createStudent(student);
	}
    
    public Boolean getConnected() {
		return connected;
	}
	
	public void setConnected(Boolean connected) {
		this.connected = connected;
	}

}