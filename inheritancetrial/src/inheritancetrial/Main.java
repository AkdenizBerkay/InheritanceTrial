package inheritancetrial;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Damla", "Sabur", "Öðrenci", "email", "123qwe", "JAVA");
		Student student2 = new Student(2, "Gizem", "Sabur", "Öðrenci", "email", "qwe123", "JAVA");

		Instructor instructor1 = new Instructor(1, "Öðretmen Adý", "Öðretmen Soyadý", "Öðretmen", "öðretmen maili",
				"password", "JAVA", "homework", true);
		Instructor instructor2 = new Instructor(2, "Engin hoca", "2.Öðretmen Soyadý", "Öðretmen",
				"2.öðretmen maili", "password2", "REACT", "Bu java ödevi", true);

		User user1 = new User(4, "ali osman", "ali osmanýn soyadý", "öðrenci", "aliosman@aliosman.com", "komiklibisey");
		User user2 = new User(5, "þermin", "þerminoðullarý", "eðitmen", "sermin@sermin.com", "sermingiller");

		Student[] students = { student1, student2 };
		Instructor[] instructors = { instructor1, instructor2 };
		User[] users = { user1, user2 };

		for (Student student : students) {
			System.out.println(student.getUserFirstName());
			System.out.println(student.getCourse());
		}
		for (User user : users) {
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
		}
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getEmail());
			System.out.println(instructor.getBranch());
		}

		System.out.println("------------------------------------------------------");
		
		UserManager userManager = new UserManager();
		userManager.add(user1);

		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor2);

	};
}
