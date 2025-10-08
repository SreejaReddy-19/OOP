package abstract_class;

abstract class Course {
    String courseName;
    String instructor;

    public abstract void startCourse();
    public abstract void endCourse();

    public void getCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Instructor: " + instructor);
    }

    public void giveCertificate() {
        System.out.println("Certificate has been awarded!");
    }
}

class ProgrammingCourse extends Course {
    @Override
    public void startCourse() {
        System.out.println("Programming Course started with IDE setup.");
    }

    @Override
    public void endCourse() {
        System.out.println("Programming Course ended with final project.");
    }
}

class LanguageCourse extends Course {
    @Override
    public void startCourse() {
        System.out.println("Language Course started with basic grammar lessons.");
    }

    @Override
    public void endCourse() {
        System.out.println("Language Course ended with speaking test.");
    }
}
public class Learning{
	public static void main(String args[]) {
		Course course = new ProgrammingCourse();
        course.courseName = "Java Bootcamp";
        course.instructor = "Mr. John";
        course.getCourseDetails();
        course.startCourse();
        course.endCourse();
        course.giveCertificate();
	}
}