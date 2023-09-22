package Service;

import DeparmentInterface.SuperDepartmentInterface;

public class SuperDepartmentImpl implements SuperDepartmentInterface {

	@Override
	public String departmentName() {
		return "Super Department";
	}

	@Override
	public String getTodaysWork() {
		return "No Work as of now";
	}

	@Override
	public String getWorkDeadline() {
		return "Nil";
	}

	@Override
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}
