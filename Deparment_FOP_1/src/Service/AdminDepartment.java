package Service;

public class AdminDepartment extends SuperDepartmentImpl {
	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

}
