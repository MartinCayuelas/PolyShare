package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import application.classesApp.SchoolClass;
import application.classesApp.Student;
import application.classesApp.Subject;
import database.BdConnection;
import persistent.DAO.SchoolClassDAO;
/**
 * <b>SchoolClass</b> is a class, with an administrator who is a student and other students
 */
public class SchoolClassDAOMySQL extends SchoolClassDAO {

    /**
     * Default constructor
     */
    public SchoolClassDAOMySQL(Connection conn) {
    	super(conn);
    }
    
    public ArrayList<SchoolClass> getAllSchoolClassesNames(){
    	SchoolClass schoolClass = new SchoolClass(null);
    	ArrayList<SchoolClass> schoolClasses = new ArrayList<SchoolClass>();
		try {
			ResultSet result = this.con.createStatement().executeQuery("SELECT * FROM Class");
			while(result.next()){ 
				schoolClass = new SchoolClass(
					result.getInt("idClass"),
		  	        result.getString("nameClass")
		  	    );
				schoolClasses.add(schoolClass);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return schoolClasses;
    }

    
    public SchoolClass findById(int id) {
    	  SchoolClass classS = new SchoolClass(0, null);      
    	    
    	  try {
    	    ResultSet result = this.con.createStatement(
    	    ResultSet.TYPE_SCROLL_INSENSITIVE,
    	    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Class WHERE idClass = " + id);
    	    if(result.first())
    	      classS = new SchoolClass(
    	    		id,
    	        result.getString("nameClass"));         
    	  } catch (SQLException e) {
    	    e.printStackTrace();
    	  }
    	  return classS;
    	}

	@Override
	public void createSchoolClass(SchoolClass sc, Student admin) {
    	Statement st;
		boolean res = false;
    	
		try {
			st = this.con.createStatement();
			// insert the class
			st.executeUpdate("INSERT INTO Class VALUES (null , \'" + sc.getNameSchoolClass() + "\')");
			
			// get the id in this class
			ResultSet rs = st.executeQuery("SELECT MAX(idClass) as maxIdClass from Class");
			rs.next();
			int idDerClass = rs.getInt("maxIdClass");
			
			// Create the link between admin and class
			st.executeUpdate("INSERT INTO Study VALUES (" + admin.getId() + ", " + idDerClass + "," + "\'admin\'" + ")");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
    }

	@Override
	public void quitSchoolClass(SchoolClass c, Student s) {
    	BdConnection.request(
    			"DELETE FROM Study where idClass =" +
    	c.getIdSchoolClass() +
    	" and idStudent=" +
    	s.getId());
    	
    	System.out.println(c.getIdSchoolClass() + " " + s.getId());
    }

	@Override
	public void addDemandStudent(SchoolClass c, Student s) {
		BdConnection.request("INSERT INTO Study VALUES (" + s.getId() + ", " + c.getIdSchoolClass() + "," + "\'waiting\'" + ")");
    }

	@Override
	public void addStudent(SchoolClass c, Student s) {
		BdConnection.request("UPDATE Study set nameStatus= \'member\' where idClass =" + c.getIdSchoolClass() + " and idStudent=" + s.getId());
	}

	@Override
	public void addSubject(Subject s, SchoolClass sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close(SchoolClass c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SchoolClass getSchoolClassByName(String s) {
		// TODO Auto-generated method stub
		SchoolClass schoolClass = new SchoolClass(null);
    	
		try {
			ResultSet result = this.con.createStatement().executeQuery("SELECT * FROM Class WHERE nameClass like \'"+ s + "\'");
			  if(result.next()) {
				schoolClass = new SchoolClass(
					result.getInt("idClass"),
		  	        result.getString("nameClass")
		  	    );
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return schoolClass;
	}

	@Override
	public List<SchoolClass> getAllSchoolClasses() {
		// TODO Auto-generated method stub
		SchoolClass schoolClass = new SchoolClass(null);
    	ArrayList<SchoolClass> schoolClasses = new ArrayList<SchoolClass>();
		try {
			ResultSet result = this.con.createStatement().executeQuery("SELECT * FROM Class");
			while(result.next()){ 
				schoolClass = new SchoolClass(
					result.getInt("idClass"),
		  	        result.getString("nameClass")
		  	    );
				schoolClasses.add(schoolClass);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return schoolClasses;
	}
	
	@Override
	public List<SchoolClass> getMatchedSchoolClasses(String pattern) {
		ResultSet rs = BdConnection.selectRequest("Select * from Class where Class.nameClass like \'" + pattern + "\'");
		
		return bdToObjects(rs);
	}

	
	/**
	 * 
	 * @param idStudent - the id of a student
	 * @return the list of class where the student is member/admin/waiting or banned
	 */
	public List<SchoolClass> getAllSchoolClassByIdStudent(int idStudent) {
		ResultSet rs = BdConnection.selectRequest("Select Class.* from Study, Class where Class.idClass = Study.idClass and Study.idStudent = " + idStudent);
		return bdToObjects(rs);
	}
	
	
	
	/**
	 * @param rs - a resultSet of all column of Class from the db
	 * @return a list of class
	 * Transform a resultSet of class in List of SchoolClass
	 */
	private SchoolClass bdToObject (ResultSet rs ) {
		
		SchoolClass sc = null;
		try {
			sc = new SchoolClass(rs.getInt(1), rs.getString(2));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return sc;
	}
	
	/**
	 * 
	 * @param rs - the response of a query (with schoolClass inside)
	 * @return a list of SchoolClass given in argement
	 * Transform a set of data from de SchoolClass table in the db to 
	 * list of SchoolClass object
	 */
	private List<SchoolClass> bdToObjects (ResultSet rs) {
		List<SchoolClass> list = new ArrayList<SchoolClass>();
		try {
			while (rs.next()) {
				list.add(bdToObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<String> getAllSchoolClassNameByIdStudent(int idStudent) {
		List<SchoolClass> scList = this.getAllSchoolClassByIdStudent(idStudent);
		ArrayList<String> nameClass = new ArrayList<String>();
    	for (SchoolClass sc : scList) {
    		nameClass.add(sc.getNameSchoolClass());
    	}
		return nameClass;
	}

	@Override
	public void joinSchoolClass(int idStudent, SchoolClass sc) {
		BdConnection.request("INSERT INTO Study VALUES (\'" + idStudent + "\', \'" + sc.getIdSchoolClass() +"\', \'study\')");
	}

	@Override
	public List<SchoolClass> getUnlikedMatchedSchoolClasses(String searchedString, int idStudent) {
		ResultSet rs = BdConnection.selectRequest("Select Class.* from Class where Class.nameClass like \'"
				 + searchedString
				 + "\' and Class.idClass not in (SELECT idClass FROM Study WHERE idStudent ="
				 + idStudent + ")");
		
		return bdToObjects(rs);
	}
	

	public void createSchoolClass(SchoolClass sc) {
		System.out.println("DAO");
		
		try {
			
			
			this.con.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO Class VALUES (0,'" + sc.getNameSchoolClass()+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}