
public class Administrator extends KFUPMUser {
	
	public Administrator() {
		
	}
	
	public void setRegistrationTiming(String time) {
		//this sets the time when students will confirm registration
	}
	
	public Course createCourse() {
		return new Course();
	}
	
	public void removeCourse(Course course) {
		//this removes a course from the official list
	}
	
	public Section createSection() {
		return new Section();
	}
	
	public void removeSection(Section section) {
		//this removes a section from the official list
	}
	
	public void setSectionTiming(Section section) {
		//this sets the time of a section
	}
	
	public void setRoomNumber(Section section) {
		//this sets the location of a section
	}
	
	public void setSectionStudentAmount(Section section) {
		//sets amount of students for a section
	}
	
	public void assignInstructor(Faculty instructor, Section section) {
		//sets a tutor for a specific section
	}
	
	public void overrideSection(Section section, Student student) {
		//allows the student to add the section even when the section is closed
	}
	
	public void setExamDate(Course course) {
		//sets the exam date for the course
	}
	
	public void updateSectionInformation() {
		//collectively calls many methods to update the information
	}
	

}
