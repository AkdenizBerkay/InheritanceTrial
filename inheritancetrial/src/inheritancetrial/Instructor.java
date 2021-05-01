package inheritancetrial;

public class Instructor extends User {
	private String branch;
	private String homework;
	private boolean takeAttendance;
	
	public Instructor() {
		
	};
	
	public Instructor(int id, String userFirstName, String userLastName, String userType, String email, String password,
			String branch, String homework, boolean takeAttendance) {
		super(id, userFirstName, userLastName, userType, email, password);
		this.branch = branch;
		this.homework = homework;
		this.takeAttendance = takeAttendance;
	}
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getHomework() {
		return homework;
	}

	public void setHomework(String homework) {
		this.homework = homework;
	}

	public boolean isTakeAttendance() {
		return takeAttendance;
	}

	public void setTakeAttendance(boolean takeAttendance) {
		this.takeAttendance = takeAttendance;
	}


	
}
