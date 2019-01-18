package facades;

import application.classesApp.Student;
import facades.exceptions.DisconnectedStudentException;
import factory.AbstractFactory;
import persistent.DAO.StudentDAO;

/**
 * @author lucadebeir, ponthieu
 */

public class LoginFacade {
	
	private AbstractFactory abstractFactory = AbstractFactory.getFactoryMySql();
	private StudentDAO studentDAO = abstractFactory.createStudentDAO();
	private Student student;
    
    /** Holder */
    private static class SingletonHolder
    {       
        /** Instance unique non préinitialisée */
        private final static LoginFacade instance = new LoginFacade();
    }
    
    /** Point d'accès pour l'instance unique du singleton */
    public static LoginFacade getInstance()
    {
        return SingletonHolder.instance;
    }


    /**
     * @param email 
     * @param password 
     * @return boolean true if the student is logged false if wrong login or password
     */
    public void login(String email, String password) {
    	student = studentDAO.login(email, password);
    	LoginFacade.getInstance().setConnectedStudent(student);
    
    }
    
    public void signUp(String nameStudent, String firstNameStudent, String emailStudent, String password, String loginID) {
		student = new Student(0, nameStudent,firstNameStudent,emailStudent,password,loginID);
		studentDAO.createStudent(student);
	}
    
    public Student getConnectedStudent() throws DisconnectedStudentException {
		return this.student;
	}

    public boolean isConnected () {
    	return this.student != null;
    }

    /**
     * update the student thanks to his id.
     * @param sCo
     */
	public void updateStudent(Student sCo) {
		studentDAO.updateStudent(sCo);
		
	}

	public void setConnectedStudent(Student newStudent) {
		this.student = newStudent;
	}

}