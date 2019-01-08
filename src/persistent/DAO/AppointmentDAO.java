package persistent.DAO;

import application.classesApp.RevisionSession;
import application.classesApp.SingleSession;

/**
 * 
 */
public abstract class AppointmentDAO {

    /**
     * Default constructor
     */
    public AppointmentDAO() {
    }


    /**
     * @param s 
     * @return
     */
    public void createSingleSession(SingleSession s) {
        // TODO implement here
    }

    /**
     * @param id 
     * @return
     */
    public AppointmentDAO getAppointmentDAOById(int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param id 
     * @return
     */
    public StudentDAO getTeacherStudentDAOById(int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param subject 
     * @return
     */
    public SingleSession getSingleSessionBySubject(String subject) {
        // TODO implement here
        return null;
    }

    /**
     * @param r 
     * @return
     */
    public void createRevisionSession(RevisionSession r) {
        // TODO implement here
    }

}