package inheritancetrial;

public class InstructorManager extends UserManager{

	public void add(Instructor instructor) {
		System.out.println(instructor.getHomework() + " "+ instructor.getUserFirstName() + " taraf�ndan sisteme eklendi");
	}
}
