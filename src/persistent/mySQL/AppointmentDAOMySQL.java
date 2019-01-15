package persistent.mySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import application.classesApp.Appointment;
import application.classesApp.RevisionSession;
import application.classesApp.SingleSession;
import application.classesApp.Student;
import application.classesApp.Subject;
import persistent.DAO.AppointmentDAO;

/**
 * @author lucadebeir
 */

/**
 * <b>Appointment</b> is a<b>Single Session</b>or a <b>Revision Session</b>
 */
public class AppointmentDAOMySQL extends AppointmentDAO {
    
	public AppointmentDAOMySQL(Connection con) {
		super(con);
    }

	@Override
	public void createSingleSession(SingleSession s) {
		// TODO Auto-generated method stub
		try {
			this.con.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO SingleSession VALUES (NULL,'" + s.getDateAppointment() + "','" + s.getIdSubject() + "','" + s.getTeacher().getId() + "','" + s.getStudent().getId() + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Appointment getAppointmentById(int id) {
		// TODO Auto-generated method stub
		RevisionSession appointment = null;
		Student teacher;
		Student student;
		ArrayList<Student> listStudent = new ArrayList<Student>();
		    
		try {
			ResultSet result = this.con.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM RevisionSession WHERE idRevisionSession = " + id);
			  
			if (result.first()) {
				  
				ResultSet resultParticipate = this.con.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Participate WHERE idRevisionSession = " + id);
	  
				while(resultParticipate.next()) {
					
					ResultSet resultStudent = this.con.createStatement(
							ResultSet.TYPE_SCROLL_INSENSITIVE,
							ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + resultParticipate.getInt("idStudent"));
					
					student = new Student(
							resultStudent.getInt("idStudent"),
							resultStudent.getString("nameStudent"),
							resultStudent.getString("firstNameStudent"),
							resultStudent.getString("emailStudent"),
							resultStudent.getString("password"),
							resultStudent.getString("loginID"),
					        null);
					
					listStudent.add(student);
				}
				
				ResultSet resultTeacher = this.con.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + result.getInt("idTeacher"));
				  
				teacher = new Student(
						resultTeacher.getInt("idStudent"),
						resultTeacher.getString("nameStudent"),
						resultTeacher.getString("firstNameStudent"),
						resultTeacher.getString("emailStudent"),
						resultTeacher.getString("password"),
						resultTeacher.getString("loginID"),
				        null);
				
				appointment = new RevisionSession(id, teacher, listStudent);
			}
			  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return appointment;
	}
	
	

	@Override
	public Student getTeacherStudentById(int id) {
		// TODO Auto-generated method stub
		Student student = null;
		
	    try {
		    ResultSet result = this.con.createStatement(
		    ResultSet.TYPE_SCROLL_INSENSITIVE,
		    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + id);
		    if(result.first())
		      student = new Student(
		    	id,
		        result.getString("nameStudent"),
		        result.getString("firstNameStudent"),
		        result.getString("emailStudent"),
		        result.getString("password"),
		        result.getString("loginID"),
		        null);         
		  } catch (SQLException e) {
		    e.printStackTrace();
		  }
		  return student;
	}

	@Override
	public SingleSession getSingleSessionBySubject(String subject) {
		// TODO Auto-generated method stub
		SingleSession singleSession = null;
		Student teacher;
		Student student;
		
		try {
			ResultSet resultSubj = this.con.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Subject WHERE nameSubject = " + subject);
			
			if (resultSubj.first()) {
				Subject subj = new Subject(
						resultSubj.getInt("idSubject"),
						subject);
					
				ResultSet result = this.con.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM SingleSession WHERE idSubject = " + resultSubj.getInt("idSubject"));
					
				if (result.first()) {
					ResultSet resultTeacher = this.con.createStatement(
							ResultSet.TYPE_SCROLL_INSENSITIVE,
							ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idTeacher = " + result.getInt("idTeacher"));
					
					teacher = new Student(
							resultTeacher.getInt("idStudent"),
							resultTeacher.getString("nameStudent"),
							resultTeacher.getString("firstNameStudent"),
							resultTeacher.getString("emailStudent"),
							resultTeacher.getString("password"),
							resultTeacher.getString("loginID"),
					        null);
					
					ResultSet resultStudent = this.con.createStatement(
							ResultSet.TYPE_SCROLL_INSENSITIVE,
							ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + result.getInt("idStudent"));
					
					student = new Student(
							resultStudent.getInt("idStudent"),
							resultStudent.getString("nameStudent"),
							resultStudent.getString("firstNameStudent"),
							resultStudent.getString("emailStudent"),
							resultStudent.getString("password"),
							resultStudent.getString("loginID"),
					        null);
					
					singleSession = new SingleSession(result.getInt("idSingleSession"), teacher, student);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return singleSession;
	}

	@Override
	public void createRevisionSession(RevisionSession r) {
		// TODO Auto-generated method stub
		try {
			this.con.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO RevisionSession VALUES (NULL,'" + r.getDateAppointment() + "','" + r.getIdSubject() + "','" + r.getTeacher().getId() + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Appointment getSingleSessionById(int id) {
		// TODO Auto-generated method stub
		SingleSession appointment = null;
		Student teacher;
		Student student;
		    
		try {
			ResultSet result = this.con.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM SingleSession WHERE idSingleSession = " + id);
			  
			if (result.first()) {
				  
				ResultSet resultStudent = this.con.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + result.getInt("idStudent"));
				  
				student = new Student(
						resultStudent.getInt("idStudent"),
						resultStudent.getString("nameStudent"),
						resultStudent.getString("firstNameStudent"),
						resultStudent.getString("emailStudent"),
						resultStudent.getString("password"),
						resultStudent.getString("loginID"),
				        null);
								
				ResultSet resultTeacher = this.con.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + result.getInt("idTeacher"));
				  
				teacher = new Student(
						resultTeacher.getInt("idStudent"),
						resultTeacher.getString("nameStudent"),
						resultTeacher.getString("firstNameStudent"),
						resultTeacher.getString("emailStudent"),
						resultTeacher.getString("password"),
						resultTeacher.getString("loginID"),
				        null);
				  
				appointment = new SingleSession(id, teacher, student);
			}
			  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return appointment;
	}
	
	/**
     * @param idClass
     * @return list of SingleSession of the class who corresponds to idClass
     */
	public ArrayList<SingleSession> getSingleSessionByClass(int idClass) {
		// TODO Auto-generated method stub
		SingleSession appointment = null;
		Student teacher;
		Subject subject;
		ArrayList<SingleSession> listSingleSession = new ArrayList<SingleSession>();
		    
		try {
			ResultSet result = this.con.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM SingleSession WHERE idClass = " + idClass);
			
			while (result.next()) {
				teacher = new Student(result.getInt("idTeacher"));
				subject = new Subject(result.getInt("idSubject"), null);
				appointment = new SingleSession(result.getInt("idSingleRevision"), teacher, null, result.getDate("dateAppointement").toLocalDate(), subject);
				listSingleSession.add(appointment);
			}
			
			for (SingleSession ss : listSingleSession) {
				ResultSet resultTeacher = this.con.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + ss.getTeacher().getId());
				
				if (resultTeacher.first()) {
					teacher = new Student(
							ss.getTeacher().getId(),
							resultTeacher.getString("nameStudent"),
							resultTeacher.getString("firstNameStudent"),
							resultTeacher.getString("emailStudent"),
							resultTeacher.getString("password"),
							resultTeacher.getString("loginID"),
					        null);
					ss.setTeacher(teacher);
					System.out.println("nameTeacherStudent : " + resultTeacher.getString("nameStudent"));
				}
				resultTeacher.close();
			}
			
			for (SingleSession ss : listSingleSession) {
				ResultSet resultSubject = this.con.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Subject WHERE idSubject = " + ss.getIdSubject());
				if(resultSubject.next()) {
					subject = new Subject(ss.getIdSubject(), resultSubject.getString("nameSubject"));
					ss.setSubject(subject);
					System.out.println("subject : " + resultSubject.getString("nameSubject"));
				}
				resultSubject.close();
			}
			  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listSingleSession;
	}
	
	/**
     * @param idClass
     * @return list of RevisionSession of the class who corresponds to idClass
     */
	public ArrayList<RevisionSession> getAppointmentByClass(int idClass) {
		// TODO Auto-generated method stub
		RevisionSession appointment = null;
		Student teacher;
		Student student;
		Subject subject;
		ArrayList<Student> listStudent = new ArrayList<Student>();
		//List<Student> listStudent2 = new CopyOnWriteArrayList<Student>();
		ArrayList<RevisionSession> listRevisionSession = new ArrayList<RevisionSession>();
		    
		try {
			ResultSet result = this.con.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM RevisionSession WHERE idClass = " + idClass);
			
			while(result.next()) {
				teacher = new Student(result.getInt("idTeacher"));
				subject = new Subject(result.getInt("idSubject"), null);
				appointment = new RevisionSession(result.getInt("idRevisionSession"), teacher, listStudent, subject, result.getDate("dateAppointement").toLocalDate());
				System.out.println(appointment.getIdAppointment());
				listRevisionSession.add(appointment);
			}
			result.close();
			
			for (RevisionSession rs : listRevisionSession) {
				System.out.println(rs.getIdAppointment());
				ResultSet resultParticipate = this.con.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Participate WHERE idSingleSession = " + rs.getIdAppointment());
				while(resultParticipate.next()) {
					student = new Student(resultParticipate.getInt("idStudent"));
					System.out.println(student.getId());
					rs.getStudent().add(student);
				}
				resultParticipate.close();
			}
			
			System.out.println(listRevisionSession);
			
			/*for (RevisionSession rs : listRevisionSession) {
				System.out.println(rs);
				listStudent2 = rs.getStudent();
				System.out.print(listStudent2);
				Iterator<Student> iter = listStudent2.iterator();
				while(iter.hasNext()) {
					Student s = iter.next();
					ResultSet resultStudent = this.con.createStatement(
							ResultSet.TYPE_SCROLL_INSENSITIVE,
							ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + s.getId());
					if(resultStudent.first()) {
						student = new Student(
								s.getId(),
								resultStudent.getString("nameStudent"),
								resultStudent.getString("firstNameStudent"),
								resultStudent.getString("emailStudent"),
								resultStudent.getString("password"),
								resultStudent.getString("loginID"),
						        null);
						System.out.println(student);
						
						listStudent.add(student);
						continue;
					}	
				}
				rs.setStudent(listStudent);
			}*/
			
			for (RevisionSession rs : listRevisionSession) {
				ResultSet resultTeacher = this.con.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + rs.getTeacher().getId());
				while(resultTeacher.next()) {
					teacher = new Student(
							rs.getTeacher().getId(),
							resultTeacher.getString("nameStudent"),
							resultTeacher.getString("firstNameStudent"),
							resultTeacher.getString("emailStudent"),
							resultTeacher.getString("password"),
							resultTeacher.getString("loginID"),
					        null);
					rs.setTeacher(teacher);
				}
				resultTeacher.close();
			}
			
			for (RevisionSession rs : listRevisionSession) {
				ResultSet resultSubject = this.con.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Subject WHERE idSubject = " + rs.getIdSubject());
				while(resultSubject.next()) {
					subject = new Subject(rs.getIdSubject(), resultSubject.getString("nameSubject"));
					rs.setSubject(subject);
					System.out.println("subject : " + resultSubject.getString("nameSubject"));
				}
				resultSubject.close();
			}
			
			
			  
			/*while (result.first()) {
				  
				ResultSet resultParticipate = this.con.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Participate WHERE idSingleSession = " + result.getInt("idRevisionSession"));
	  
				while(resultParticipate.next()) {
					
					ResultSet resultStudent = this.con.createStatement(
							ResultSet.TYPE_SCROLL_INSENSITIVE,
							ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + resultParticipate.getInt("idStudent"));
					
					while(resultStudent.next()) {
						student = new Student(
								resultStudent.getInt("idStudent"),
								resultStudent.getString("nameStudent"),
								resultStudent.getString("firstNameStudent"),
								resultStudent.getString("emailStudent"),
								resultStudent.getString("password"),
								resultStudent.getString("loginID"),
						        null);
						
						listStudent.add(student);
						
						ResultSet resultTeacher = this.con.createStatement(
								ResultSet.TYPE_SCROLL_INSENSITIVE,
								ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + result.getInt("idTeacher"));
						
						while(resultTeacher.next()) {
							teacher = new Student(
									resultTeacher.getInt("idStudent"),
									resultTeacher.getString("nameStudent"),
									resultTeacher.getString("firstNameStudent"),
									resultTeacher.getString("emailStudent"),
									resultTeacher.getString("password"),
									resultTeacher.getString("loginID"),
							        null);
							
							appointment = new RevisionSession(result.getInt("idRevisionSession"), teacher, listStudent, result.getInt("idSubject"), result.getDate("dateAppointement"));
							listRevisionSession.add(appointment);
						}
					}
				}  
				
			}*/
			  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listRevisionSession;
	}
	
	public void recommendStudent(Student student) {
		
	}

}