
public class Student extends KFUPMUser {
	
	private double GPA;
	private int creditHours;
	private Section[] finishedCourses;
	private String[] finishedGrades;
	private Faculty advisor;
	private Section[] sections;
	
	public Student() {
		
	}
	
	public Section[] viewTranscript() {
		return finishedCourses;
	}
	
	public void viewCourses() {
		//this uses a database with all courses available from kfupm
	}
	
	public void viewCoursePrerequisites() {
		//this uses a database with all course prerequisites available from kfupm
	}
	
	public void confirmRegistration() {
		//confirms registration
	}

}
