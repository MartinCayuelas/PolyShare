import java.util.ArrayList;
import java.util.Scanner;

import application.classesApp.SchoolClass;
import application.classesApp.Skill;
import application.classesApp.Student;
import factory.AbstractFactory;
import persistent.DAO.SchoolClassDAO;
import persistent.DAO.SkillDAO;
import persistent.DAO.StudentDAO;

public class TestDAO {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	    System.out.println("");
	    AbstractFactory adf = AbstractFactory.getFactoryMySql();
	    //On récupère un objet faisant le lien entre la base et nos objets 
	    StudentDAO studentDao = adf.getStudentDAO();
	    
	    /*System.out.println("IdStudent : ");
		int idStudent = scan.nextInt();
		System.out.println("NameStudent : ");
		String nameStudent = scan.next();
		System.out.println("FirstNameStudent : ");
		String firstNameStudent = scan.next();*/
		System.out.println("EmailStudent : ");
		String emailStudent = scan.next();
		System.out.println("Password : ");
		String password = scan.next();
		/*System.out.println("LoginID : ");
		String loginID = scan.next();*/

	    //Student student1 = new Student(idStudent,nameStudent,firstNameStudent,emailStudent,password,loginID);
	    
	    Student login = studentDao.login(emailStudent,password);
	    if (login != null) {
	    		System.out.println("Vous êtes connecté !");
	    } else {
	    		System.out.println("Vous n'avez pas réussi à vous connecter.");
	    }
	    
	    //Student student2 = studentDao.find(2);
	    //studentDao.delete(student2);
	    
	    for(int i = 1; i < 12; i++){
	      //On fait notre recherche
	      Student student = studentDao.findById(i);
	      System.out.println("\tELEVE N°" + i + " - NOM : " + student.getNameStudent() + " - PRENOM : " + student.getFirstNameStudent());
	    } 
	    
	    //Test de l'affichage de toutes les classes
	    SchoolClassDAO schoolClassDao = adf.getSchoolClassDAO();
	    ArrayList<SchoolClass> names = schoolClassDao.getAllSchoolClassesNames();
	    for(SchoolClass sc : names) {
	    	System.out.println("Classes : " + sc.getNameSchoolClass());
	    }
	    
	    SkillDAO skillDAO = adf.createSkillDAO();
	    System.out.println("IdStudent: "+login.getId());
	    ArrayList<Skill> skills = skillDAO.findSkillsByIdStudent(login.getId());
	    for(Skill sc : skills) {
	    	System.out.println("Skills : "+ sc.toString());
	    }
	    
	    
	    
	}
	
}

