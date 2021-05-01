package inheritancetrial;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println(student.getCourse()+ " -kurs eklendi-");
	}
	
}
