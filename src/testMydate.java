import java.util.ArrayList;

import application.classesApp.Appointment;
import application.classesApp.Student;
import factory.AbstractFactory;
import persistent.DAO.AppointmentDAO;
import ui.myAppointement.MyAppointmentsController;

public class testMydate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AbstractFactory abstractFactory = AbstractFactory.getFactoryMySql();
		 AppointmentDAO appointmentDAO = abstractFactory.createAppointmentDAO();
		 Student s = new Student(1);
		 MyAppointmentsController myapp = new MyAppointmentsController();
		 ArrayList<Appointment>  myApps = new ArrayList<Appointment>   ();
		 myApps = myapp.getMyAppointments(s);
		 System.out.println(myApps.get(0).getDateAppointment() );
		 for (int i =0 ; i < myApps.size();i++) {
			 System.out.println(myApps.get(i).getIdAppointment() + myApps.get(i).getSubject().getNameSubject() + myApps.get(i).getTeacher().getNameStudent() + myApps.get(i).getDateAppointment().getShowingDate() );
			 
		 }

	}

}
